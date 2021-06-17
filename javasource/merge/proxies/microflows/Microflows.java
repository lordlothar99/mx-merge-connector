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
	public static void backTo_Step1(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		Core.microflowCall("Merge.BackTo_Step1").withParams(params).execute(context);
	}
	public static merge.proxies.MergeConfiguration getOrNew_MergeConfiguration(IContext context)
	{
		Map<java.lang.String, Object> params = new HashMap<>();
		IMendixObject result = (IMendixObject)Core.microflowCall("Merge.GetOrNew_MergeConfiguration").withParams(params).execute(context);
		return result == null ? null : merge.proxies.MergeConfiguration.initialize(context, result);
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