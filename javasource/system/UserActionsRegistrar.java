package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(merge.actions.GenerateLinkToken.class);
    registrator.registerUserAction(merge.actions.GetEmployees.class);
    registrator.registerUserAction(merge.actions.GetLocations.class);
    registrator.registerUserAction(merge.actions.RetrieveAccountToken.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
