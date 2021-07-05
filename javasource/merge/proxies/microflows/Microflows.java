// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package merge.proxies.microflows;

import java.util.HashMap;
import java.util.Map;
import com.mendix.core.Core;
import com.mendix.core.CoreException;
import com.mendix.systemwideinterfaces.MendixRuntimeException;
import com.mendix.systemwideinterfaces.core.IContext;
import com.mendix.systemwideinterfaces.core.IMendixObject;

public class Microflows
{
	// These are the microflows for the Merge module
	public static java.lang.String act_GenerateLinkToken(IContext context, merge.proxies.MergeConfiguration _mergeConfiguration)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MergeConfiguration", _mergeConfiguration == null ? null : _mergeConfiguration.getMendixObject());
		return (java.lang.String) Core.microflowCall("Merge.Act_GenerateLinkToken").withParams(params).execute(context);
	}
	public static java.lang.String act_RetrieveAccountToken(IContext context, java.lang.String _publicToken, java.lang.String _apiKey)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("PublicToken", _publicToken);
		params.put("ApiKey", _apiKey);
		return (java.lang.String) Core.microflowCall("Merge.Act_RetrieveAccountToken").withParams(params).execute(context);
	}
	public static void act_SyncEmployees(IContext context, merge.proxies.SyncContext _syncContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SyncContext", _syncContext == null ? null : _syncContext.getMendixObject());
		Core.microflowCall("Merge.Act_SyncEmployees").withParams(params).execute(context);
	}
	public static void back_2_Steps(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("Merge.Back_2_Steps").withParams(params).execute(context);
	}
	public static java.util.List<merge.proxies.Employee> dS_Employees(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.List<IMendixObject> objs = Core.microflowCall("Merge.DS_Employees").withParams(params).execute(context);
		java.util.List<merge.proxies.Employee> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(merge.proxies.Employee.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<merge.proxies.Employment> dS_Employments(IContext context, merge.proxies.Employee _employee)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("Employee", _employee == null ? null : _employee.getMendixObject());
		java.util.List<IMendixObject> objs = Core.microflowCall("Merge.DS_Employments").withParams(params).execute(context);
		java.util.List<merge.proxies.Employment> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(merge.proxies.Employment.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<merge.proxies.Location> dS_Locations(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.List<IMendixObject> objs = Core.microflowCall("Merge.DS_Locations").withParams(params).execute(context);
		java.util.List<merge.proxies.Location> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(merge.proxies.Location.initialize(context, obj));
		}
		return result;
	}
	public static java.util.List<merge.proxies.Team> dS_Teams(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		java.util.List<IMendixObject> objs = Core.microflowCall("Merge.DS_Teams").withParams(params).execute(context);
		java.util.List<merge.proxies.Team> result = null;
		if (objs != null)
		{
			result = new java.util.ArrayList<>();
			for (IMendixObject obj : objs)
				result.add(merge.proxies.Team.initialize(context, obj));
		}
		return result;
	}
	public static merge.proxies.MergeConfiguration getOrNew_MergeConfiguration(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Merge.GetOrNew_MergeConfiguration").withParams(params).execute(context);
		return result == null ? null : merge.proxies.MergeConfiguration.initialize(context, result);
	}
	public static void new_SyncLogEntry(IContext context, merge.proxies.SyncProcess _syncProcess, merge.proxies.LogLevel _logLevel, java.lang.String _message)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("SyncProcess", _syncProcess == null ? null : _syncProcess.getMendixObject());
		params.put("LogLevel", _logLevel == null ? null : _logLevel.name());
		params.put("Message", _message);
		Core.microflowCall("Merge.New_SyncLogEntry").withParams(params).execute(context);
	}
	public static void proceed_Step2(IContext context, merge.proxies.MergeConfiguration _mergeConfiguration)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("MergeConfiguration", _mergeConfiguration == null ? null : _mergeConfiguration.getMendixObject());
		Core.microflowCall("Merge.Proceed_Step2").withParams(params).execute(context);
	}
	public static void proceed_Step3(IContext context, merge.proxies.LinkContext _linkContext)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		params.put("LinkContext", _linkContext == null ? null : _linkContext.getMendixObject());
		Core.microflowCall("Merge.Proceed_Step3").withParams(params).execute(context);
	}
}