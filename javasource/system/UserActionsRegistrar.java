package system;

import com.mendix.core.actionmanagement.IActionRegistrator;

public class UserActionsRegistrar
{
  public void registerActions(IActionRegistrator registrator)
  {
    registrator.bundleComponentLoaded();
    registrator.registerUserAction(merge.actions.EmployeesList.class);
    registrator.registerUserAction(merge.actions.EmploymentsList.class);
    registrator.registerUserAction(merge.actions.GenerateLinkToken.class);
    registrator.registerUserAction(merge.actions.LocationsList.class);
    registrator.registerUserAction(merge.actions.RetrieveAccountToken.class);
    registrator.registerUserAction(merge.actions.TeamsList.class);
    registrator.registerUserAction(system.actions.VerifyPassword.class);
  }
}
