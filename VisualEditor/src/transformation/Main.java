package transformation;

import java.io.IOException;

import grammar.Grammar;
import grammar.GrammarPackage;
import grammar.Rule;
import graph.Graph;
import graph.GraphPackage;
import graph.Node;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

public class Main {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		/*GraphPackage graphPackage = GraphPackage.eINSTANCE;
		GrammarPackage grammarPackage = GrammarPackage.eINSTANCE;
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("graph", new XMIResourceFactoryImpl());
	    resourceSet.getResourceFactoryRegistry().getExtensionToFactoryMap().put("grammar", new XMIResourceFactoryImpl());	
		URI uriGraph = URI.createURI("file:/D:/Workspace/runtime-EclipseApplication/Transformationproject/My.graph");
		URI uriGrammar = URI.createURI("file:/D:/Workspace/runtime-EclipseApplication/Transformationproject/My.grammar");
		Resource resourceGraph = resourceSet.getResource(uriGraph,true);
		Resource resourceGrammar = resourceSet.getResource(uriGrammar,true);
		System.out.println("ressource created ");
		
		try
		{
			resourceGraph.load(null);
			resourceGrammar.load(null);
			Graph po = (Graph)resourceGraph.getContents().get(0);
			System.out.println("loaded: " + po);
			
			Grammar g = (Grammar)resourceGrammar.getContents().get(0);
			System.out.println("loaded: " + g);
			
			

		}
		catch (IOException e)
		{
		System.out.println("failed to read from " );
		}*/
 Graph a =loadGraph("file:/D:/Workspace/runtime-EclipseApplication/Transformationproject/My.graph");
	System.out.println("loaded: " + a);

 Grammar g= loadGrammar("file:/D:/Workspace/runtime-EclipseApplication/Transformationproject/My.grammar");
	System.out.println("loaded: " + g);

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

public void saveGraph (Graph graph)
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
		return g;		
		

	}
	catch (IOException e)
	{
	System.out.println("failed to read from "+ uriGrammar);
	return null;
	}
}


}