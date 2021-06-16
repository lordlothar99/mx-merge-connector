package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(merge.actions.MergeLink.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
