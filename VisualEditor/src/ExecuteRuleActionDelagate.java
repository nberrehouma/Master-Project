import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
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

import graph.Graph;

public class ExecuteRuleActionDelagate implements IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow window;
	
	@Override
	public void run(IAction action) {
		// TODO Auto-generated method stub
		
		IWorkbenchPage page = this.window.getActivePage();
		ISelection selection = page.getSelection();
		MessageConsole myConsole = findConsole("graph transformation console");
		   MessageConsoleStream out = myConsole.newMessageStream();
		   out.println("graph transformation console");
		    out.println("Selection is: " + selection);
		   		    
		    String id = IConsoleConstants.ID_CONSOLE_VIEW;
		    IConsoleView view;
			try {
				view = (IConsoleView) page.showView(id);
				view.display(myConsole);
			} catch (PartInitException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		  
		   
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		// TODO Auto-generated method stub
    boolean enabled = false;
    ISelection f = selection;
   
    
   // action.setEnabled(enabled);
	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}

	@Override
	public void init(IWorkbenchWindow window) {
		// TODO Auto-generated method stub
		this.window = window;
		ISelectionListener sl = new ISelectionListener() {
		     
			public void selectionChanged(IWorkbenchPart part, ISelection sel) {
		           	  System.out.println("Selection is: " + sel);
		      }
		   };
		   
		   IWorkbenchPage page = this.window.getActivePage();
		   page.addSelectionListener(sl);
	}
	
	private MessageConsole findConsole(String name) {
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

}
