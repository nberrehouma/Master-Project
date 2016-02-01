import org.eclipse.jface.action.IAction;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.ui.ISelectionListener;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.IWorkbenchWindowActionDelegate;

public class ExecuteRuleActionDelagate implements IWorkbenchWindowActionDelegate {

	private IWorkbenchWindow window;
	
	@Override
	public void run(IAction action) {
		// TODO Auto-generated method stub
		IWorkbenchPage page = this.window.getActivePage();
		ISelection selection = page.getSelection();
		ISelectionListener sl = new ISelectionListener() {
		      public void selectionChanged(IWorkbenchPart part, ISelection sel) {
		         System.out.println("Selection is: " + sel);
		      }
		   };
		   
		   
		   page.addSelectionListener(sl);
		   
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
	}

}
