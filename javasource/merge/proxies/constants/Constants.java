// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package merge.proxies.constants;

import com.mendix.core.Core;

public class Constants
{
	// These are the constants for the Merge module

	public static java.lang.String getHRIS_BasePath()
	{
		return (java.lang.String)Core.getConfiguration().getConstantValue("Merge.HRIS_BasePath");
	}
}