import java.io.IOException;
import java.io.OutputStream;
import java.util.Iterator;
import java.util.Random;

import org.eclipse.core.runtime.IPath;
import org.eclipse.core.runtime.preferences.IEclipsePreferences;
import org.eclipse.core.runtime.preferences.InstanceScope;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.console.ConsolePlugin;
import org.eclipse.ui.console.IConsole;
import org.eclipse.ui.console.IConsoleConstants;
import org.eclipse.ui.console.IConsoleManager;
import org.eclipse.ui.console.IConsoleView;
import org.eclipse.ui.console.MessageConsole;
import org.eclipse.ui.console.MessageConsoleStream;
import org.eclipse.ui.part.FileEditorInput;
import org.osgi.service.prefs.Preferences;

import grammar.ConnexionInstruction;
import grammar.Embedding;
import grammar.Grammar;
import grammar.GrammarPackage;
import grammar.Rule;
import graph.Edge;
import graph.Graph;
import graph.GraphFactory;
import graph.GraphPackage;
import graph.Node;

public class ExecuteRuleActionDelagate implements IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow window;
	private MessageConsoleStream out=null;
	private IConsole myConsole;
	private IEditorPart editor;
	private IEditorInput input;
	private boolean graph_bool;
	private IEclipsePreferences preferences;
	private String path, run_p, emb_p, ex_p, save_p;
	@Override
	public void run(IAction action) {
		// TODO Auto-generated method stub
	//***************récuperation des valeurs de préferences*****************	
		preferences = InstanceScope.INSTANCE.getNode("VE.test");
		 Preferences sub1 = preferences.node("node1");
		 Preferences sub2 = preferences.node("node2");
		  path = sub1.get("h1", "default"); 
		  run_p = sub2.get("h1", "default"); 
		  emb_p = sub2.get("h2", "default"); 
		  ex_p = sub2.get("h3", "default");
		  save_p = sub2.get("h4", "default"); 
		  out.println(path + run_p + emb_p + ex_p + save_p);
		
		IWorkbenchPage page = this.window.getActivePage();
		ISelection selection = page.getSelection();
		String select = selection.toString();
	    String sub=  select.substring(select.lastIndexOf("/") + 1, select.lastIndexOf("]"));
	    
		
		
			editor = page.getActiveEditor();
		    input = editor.getEditorInput();
		    IPath path = ((FileEditorInput)input).getPath();  
		    
		    String graphpath= path.toString();
		    String xxx =  graphpath.substring(graphpath.lastIndexOf("/") + 1);
		    
		if (run_p=="choice2")  
		{
		   if (isGraph(xxx))
		   {   
			   out.println("Graph active on editor is: "+ xxx);
			   Graph a =loadGraph("file:///E:/bara/runtime-EclipseApplication/xx/"+ xxx);
			   out.println("The graph: " + a +"\n");
			   if (isGrammar(sub)) 
			   {
				 out.println("Grammar Selected is: " + sub);  
		         Grammar g= loadGrammar("file:///E:/bara/runtime-EclipseApplication/xx/"+ sub);
		         out.println("The grammar: "+g +"\n");
		         
		         executeGrammar(a,g, emb_p);
		         
		         notification.LanceurNotification.not_validation();
                 show(a.toString().length());			
		         out.println(" \t FINAL RESULT: " + a + "\n");
		         show(a.toString().length());	
		   /*      String id = IConsoleConstants.ID_CONSOLE_VIEW;
			     IConsoleView view;
				try {
					view = (IConsoleView) page.showView(id);
					view.display(myConsole);
				} catch (PartInitException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} */
			   }
			   else 
				   {
				   notification.LanceurNotification.not_erreur("s");
				   out.println("File selected is not a Grammar, please check it again");
				   }
		   }
		   else
			   {
			   notification.LanceurNotification.not_erreur("a");
			   out.println("Current file open in editor is not a Graph, please check it again");
			   }
		} 
		
		else if(run_p=="choice1") 
		{
			 if (isGraph(sub))
			   {   
				   out.println("Graph Selected is: "+ sub);
				   Graph a =loadGraph("file:///E:/bara/runtime-EclipseApplication/xx/"+ sub);
				   out.println("The graph: " + a +"\n");
				   if (isGrammar(xxx)) 
				   {
					 out.println("Grammar active in editor is: " + xxx);  
			         Grammar g= loadGrammar("file:///E:/bara/runtime-EclipseApplication/xx/"+ xxx);
			         out.println("The grammar: "+g +"\n");
			         executeGrammar(a,g, emb_p);
			         
			         notification.LanceurNotification.not_validation();
	                 show(a.toString().length());			
			         out.println(" \t FINAL RESULT: " + a + "\n");
			         show(a.toString().length());	
				   }
				   else 
					   {
					   notification.LanceurNotification.not_erreur("s");
					   out.println("File selected is not a Graph, please check it again");
					   }
			   }
			   else
				   {
				   notification.LanceurNotification.not_erreur("a");
				   out.println("Current file open in editor is not a Grammar, please check it again");
				   }
		}
				
		    
		  
		   
	}
	
	
	private void show(int length) 
	{
		// TODO Auto-generated method stub
		out.print("\t");
		for (int i=0; i<length+15; i++) 
		{
			out.print("*");
		}
		out.println("\n");
	}

	private boolean isGrammar(String sub) {
		// TODO Auto-generated method stub
		String extension = sub.substring(sub.lastIndexOf(".") + 1);
		if (extension.length()==7) return true;
		else return false;
	}

	private boolean isGraph(String xxx) {
		// TODO Auto-generated method stub
		String extension = xxx.substring(xxx.lastIndexOf(".") +1);
		if (extension.length()==5) return true;
		else return false;
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
    boolean enabled = false;
    ISelection f = selection;
   
     //action.setEnabled(enabled);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub
		MessageConsole myConsole = findConsole("graph transformation console");
		  out = myConsole.newMessageStream();
		this.window = window;
		// notification.LanceurNotification.not_info("w");
		out.print("");
		ISelectionListener sl = new ISelectionListener() {
		     
			public void selectionChanged(IWorkbenchPart part, ISelection sel) {
				   /*  String select = sel.toString();
				     select = select.substring(select.lastIndexOf(".") +1);
				     if (isGraph(select) || isGrammar(select))*/
		        	 
				out.println("Selection is: " + sel);
		      }
		   };
		   
		   IWorkbenchPage page = this.window.getActivePage();
		   page.addSelectionListener(sl);
	}
	
	public static MessageConsole findConsole(String name) {
	      ConsolePlugin plugin = ConsolePlugin.getDefault();
	      IConsoleManager conMan = plugin.getConsoleManager();
	      IConsole[] existing = conMan.getConsoles();
	      for (int i = 0; i < existing.length; i++)
	         if (name.equals(existing[i].getName()))
	            return (MessageConsole) existing[i];
	      //no console found, so create a new one
	      MessageConsole myConsole = new MessageConsole(name, null);
	      conMan.addConsoles(new IConsole[]{myConsole});
	      return myConsole;
	   }
	public  void supprimer(Graph gr, Node n)
	   {
		String label = n.getName();
		gr.getNodes().remove(n);
		EList<Edge> edge= gr.getEdges();
		
	    out.println("Edges removed are : ");
		for(int i=0; i<edge.size() ;i++)
		{
		     Edge e=edge.get(i);
		     if (label.equals(e.getSource().getName()) || label.equals(e.getTarget().getName())) 
		     {
		    	 out.println(e.toString());
		    	 gr.getEdges().remove(e);
		    	 i--;
		     }
		}
		gr.getEdges().remove(n);
		out.println("node "+n.getName()+" deleted");
		}
	
	//rule qui à la priorité
	private static int priorite(EList<Rule> R) {
		
		Rule r;
		int min ;
		int p=-1;
	    int last_p = -1;
       // EList<Rule> temp = R;
		int i=0;
		 int m;
		 if (R.isEmpty()==false)
		 {
			min=R.get(0).getPriority();
			for ( i=1; i<R.size(); i++)
			{
				r = R.get(i);
				m=r.Mark(); //System.out.println(m);
				if (m==0) 
				{
				if (r.getPriority() <= min)
				  {
					min = r.getPriority();
				    p = i; 
				  }
				}
			}
			if (p!= -1) //if vide 
			{ 
			   R.get(p).unMarkRule();
			   System.out.println(p + "p");
			}
		 }
        return p;
	}
	private static void ajouter(Graph H, Graph D, Embedding C) {
		EList<Node> Vd = D.getNodes();
		EList<Node> nh = H.getNodes();
		System.out.println(Vd.size());
	    for(int i=0;i<Vd.size();i++)
	    {
			Node nd= Vd.get(i);
			Node node = GraphFactory.eINSTANCE.createNode();
		    node.setName(nd.getName());
		    node.markNode();
		    node.setParent(H);
		    for(int j=0;j<C.getInstructions().size();j++)
			 {
				 ConnexionInstruction e = C.getInstructions().get(j); 
				 for(int k=0;k<nh.size();k++) 
				 {
					Node n = nh.get(k);
				    int	m=n.Mark();
					if (m==0) 
					{
						if(n.getName().equals(e.getM()) && nd.getName().equals(e.getD().getName()))
						{
							Edge edge = GraphFactory.eINSTANCE.createEdge();
							edge.setSource(n);  
							edge.setTarget(nd);
							edge.setParent(H);
						}
		
				 }
			 }
	    }
	    }
	    
	  // tissage(H,C);
	}


	public static Graph loadGraph(String path){
		GraphPackage graphPackage = GraphPackage.eINSTANCE;
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("graph", new XMIResourceFactoryImpl());
		URI uriGraph = URI.createURI(path);
		Resource resourceGraph = resourceSet.getResource(uriGraph,true);
		try
		{
			resourceGraph.load(null);
			Graph g = (Graph)resourceGraph.getContents().get(0);
			return g;
		}
		catch (IOException e)
		{
		System.out.println("failed to read from " +  uriGraph );
		return null;
		}
		
	}

	public void saveGraph (Graph graph, OutputStream path)

	{
		
	}

	public static Grammar loadGrammar(String path){
		GraphPackage graphPackage = GraphPackage.eINSTANCE;
		GrammarPackage grammarPackage = GrammarPackage.eINSTANCE;
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("graph", new XMIResourceFactoryImpl());
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("grammar", new XMIResourceFactoryImpl());	
		URI uriGrammar = URI.createURI(path);
		Resource resourceGrammar = resourceSet.getResource(uriGrammar,true);
		
		try
		{
			resourceGrammar.load(null);
			
			Grammar g = (Grammar)resourceGrammar.getContents().get(0);
			//System.out.println(g);
			return g;		
			}
		catch (IOException e)
		{
		System.out.println("failed to read from "+ uriGrammar);
		return null;
		}
	}


	//execute a grammar on a graph
	public  void executeGrammar (Graph gr, Grammar G , String emb_p ) 
	   
	   {  
		  EList<Rule> rules = G.getRules();
		  
		  
		  if (emb_p=="C1") // iterative
		  {
			  if (ex_p=="stockage") //par ordre de stockage
			  {
				  out.println("Iterative - stockage ..... en cours de dvpt");
			  }
			  else if (ex_p=="priorite")
			  {
				  out.println("Iterative - priorité ..... en cours de dvpt");
			  }
			  else if (ex_p=="aleatoire")
			  {
				  out.println("Iterative - random ..... en cours de dvpt");
			  }
		   
		  }
		  else //recursive
		  {  
			  if (ex_p=="stockage") //par ordre de stockage
			  {
				  Iterator<Rule> R =rules.iterator();
				  while(R.hasNext())
				  {
					  Rule rul =R.next();
					  executeRule(gr,rul);  
				  }
			  }
			  else if (ex_p=="priorite")
			  {
				  while(all_marked(rules)==false)
				  {
				  int pos_min = priorite(rules); //get the right rule
				
			      if (pos_min!=-1)   executeRule(gr,rules.get(pos_min));  
				  }
			
			  }
			  else if (ex_p=="aleatoire")
			  {
				  while(all_marked(rules)==false)
				  {
					  Rule rule = rules.get(new Random().nextInt(rules.size()));  
					  rule.unMarkRule();
					  executeRule(gr,rule);  
				  }
			  }
		  }
	  
	}
		
  // vrai si tous les marker sont à 1
	private boolean all_marked(EList<Rule> rules) {
		// TODO Auto-generated method stub
		boolean tr=false;
		 Iterator<Rule> R =rules.iterator();
		  while(R.hasNext() && tr == false)
		  {
			  Rule rul =R.next();
			  if (rul.Mark()==0) tr=true;
	      }
		return tr;
	}

    //Only one rule 
	public static int pos = -1;
	
	public  void executeRule(Graph gr, Rule r) {
		
		EList<Node> nds = gr.getNodes();  
		
	    Node LHSNode = r.getLhs().getNode();
		
		pos=occurence(nds, pos, LHSNode);
	
		if (pos==-1)  System.out.println("Aucune occurence de "+ LHSNode); 
		else {  //suppression et ajout en mm temps
				supprimer(gr,nds.get(pos)); 
				ajouter(gr,r.getRhs().getSubGraph(), r.getEmbeddingMechanism());
			}	
	/*	if (pos != nds.size()) 
		{
			occurence(nds, pos, LHSNode);
			supprimer(gr,nds.get(pos)); 
			ajouter(gr,r.getRhs().getSubGraph(), r.getEmbeddingMechanism());
		}*/

	  }

	private static int occurence(EList<Node> nds, int pos, Node lHSNode) {
		// TODO Auto-generated method stub
		for(int i=pos;i<nds.size();i++)
		{
			if (i == -1) 
			{
				i=0;
			}
	        Node n =nds.get(i);
			if (n.equals(lHSNode))
			{
			pos = i;
			break;
			} 
		}
		return pos;
	}

}
