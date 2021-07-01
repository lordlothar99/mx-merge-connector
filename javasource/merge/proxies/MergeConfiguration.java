// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package merge.proxies;

public class MergeConfiguration
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject mergeConfigurationMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Merge.MergeConfiguration";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		OrganizationId("OrganizationId"),
		OrganizationName("OrganizationName"),
		EmailAddress("EmailAddress"),
		APIKey("APIKey"),
		Integration("Integration"),
		Category_hris("Category_hris"),
		Category_ats("Category_ats"),
		Category_accounting("Category_accounting"),
		AccountToken("AccountToken");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@java.lang.Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public MergeConfiguration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Merge.MergeConfiguration"));
	}

	protected MergeConfiguration(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mergeConfigurationMendixObject)
	{
		if (mergeConfigurationMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("Merge.MergeConfiguration", mergeConfigurationMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Merge.MergeConfiguration");

		this.mergeConfigurationMendixObject = mergeConfigurationMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'MergeConfiguration.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static merge.proxies.MergeConfiguration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return merge.proxies.MergeConfiguration.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static merge.proxies.MergeConfiguration initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new merge.proxies.MergeConfiguration(context, mendixObject);
	}

	public static merge.proxies.MergeConfiguration load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return merge.proxies.MergeConfiguration.initialize(context, mendixObject);
	}

	public static java.util.List<merge.proxies.MergeConfiguration> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<merge.proxies.MergeConfiguration> result = new java.util.ArrayList<merge.proxies.MergeConfiguration>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//Merge.MergeConfiguration" + xpathConstraint))
			result.add(merge.proxies.MergeConfiguration.initialize(context, obj));
		return result;
	}

	/**
	 * Commit the changes made on this proxy object.
	 */
	public final void commit() throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Commit the changes made on this proxy object using the specified context.
	 */
	public final void commit(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		com.mendix.core.Core.commit(context, getMendixObject());
	}

	/**
	 * Delete the object.
	 */
	public final void delete()
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}

	/**
	 * Delete the object using the specified context.
	 */
	public final void delete(com.mendix.systemwideinterfaces.core.IContext context)
	{
		com.mendix.core.Core.delete(context, getMendixObject());
	}
	/**
	 * @return value of OrganizationId
	 */
	public final java.lang.String getOrganizationId()
	{
		return getOrganizationId(getContext());
	}

	/**
	 * @param context
	 * @return value of OrganizationId
	 */
	public final java.lang.String getOrganizationId(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OrganizationId.toString());
	}

	/**
	 * Set value of OrganizationId
	 * @param organizationid
	 */
	public final void setOrganizationId(java.lang.String organizationid)
	{
		setOrganizationId(getContext(), organizationid);
	}

	/**
	 * Set value of OrganizationId
	 * @param context
	 * @param organizationid
	 */
	public final void setOrganizationId(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String organizationid)
	{
		getMendixObject().setValue(context, MemberNames.OrganizationId.toString(), organizationid);
	}

	/**
	 * @return value of OrganizationName
	 */
	public final java.lang.String getOrganizationName()
	{
		return getOrganizationName(getContext());
	}

	/**
	 * @param context
	 * @return value of OrganizationName
	 */
	public final java.lang.String getOrganizationName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.OrganizationName.toString());
	}

	/**
	 * Set value of OrganizationName
	 * @param organizationname
	 */
	public final void setOrganizationName(java.lang.String organizationname)
	{
		setOrganizationName(getContext(), organizationname);
	}

	/**
	 * Set value of OrganizationName
	 * @param context
	 * @param organizationname
	 */
	public final void setOrganizationName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String organizationname)
	{
		getMendixObject().setValue(context, MemberNames.OrganizationName.toString(), organizationname);
	}

	/**
	 * @return value of EmailAddress
	 */
	public final java.lang.String getEmailAddress()
	{
		return getEmailAddress(getContext());
	}

	/**
	 * @param context
	 * @return value of EmailAddress
	 */
	public final java.lang.String getEmailAddress(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.EmailAddress.toString());
	}

	/**
	 * Set value of EmailAddress
	 * @param emailaddress
	 */
	public final void setEmailAddress(java.lang.String emailaddress)
	{
		setEmailAddress(getContext(), emailaddress);
	}

	/**
	 * Set value of EmailAddress
	 * @param context
	 * @param emailaddress
	 */
	public final void setEmailAddress(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String emailaddress)
	{
		getMendixObject().setValue(context, MemberNames.EmailAddress.toString(), emailaddress);
	}

	/**
	 * @return value of APIKey
	 */
	public final java.lang.String getAPIKey()
	{
		return getAPIKey(getContext());
	}

	/**
	 * @param context
	 * @return value of APIKey
	 */
	public final java.lang.String getAPIKey(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.APIKey.toString());
	}

	/**
	 * Set value of APIKey
	 * @param apikey
	 */
	public final void setAPIKey(java.lang.String apikey)
	{
		setAPIKey(getContext(), apikey);
	}

	/**
	 * Set value of APIKey
	 * @param context
	 * @param apikey
	 */
	public final void setAPIKey(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String apikey)
	{
		getMendixObject().setValue(context, MemberNames.APIKey.toString(), apikey);
	}

	/**
	 * @return value of Integration
	 */
	public final java.lang.String getIntegration()
	{
		return getIntegration(getContext());
	}

	/**
	 * @param context
	 * @return value of Integration
	 */
	public final java.lang.String getIntegration(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Integration.toString());
	}

	/**
	 * Set value of Integration
	 * @param integration
	 */
	public final void setIntegration(java.lang.String integration)
	{
		setIntegration(getContext(), integration);
	}

	/**
	 * Set value of Integration
	 * @param context
	 * @param integration
	 */
	public final void setIntegration(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String integration)
	{
		getMendixObject().setValue(context, MemberNames.Integration.toString(), integration);
	}

	/**
	 * @return value of Category_hris
	 */
	public final java.lang.Boolean getCategory_hris()
	{
		return getCategory_hris(getContext());
	}

	/**
	 * @param context
	 * @return value of Category_hris
	 */
	public final java.lang.Boolean getCategory_hris(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Category_hris.toString());
	}

	/**
	 * Set value of Category_hris
	 * @param category_hris
	 */
	public final void setCategory_hris(java.lang.Boolean category_hris)
	{
		setCategory_hris(getContext(), category_hris);
	}

	/**
	 * Set value of Category_hris
	 * @param context
	 * @param category_hris
	 */
	public final void setCategory_hris(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean category_hris)
	{
		getMendixObject().setValue(context, MemberNames.Category_hris.toString(), category_hris);
	}

	/**
	 * @return value of Category_ats
	 */
	public final java.lang.Boolean getCategory_ats()
	{
		return getCategory_ats(getContext());
	}

	/**
	 * @param context
	 * @return value of Category_ats
	 */
	public final java.lang.Boolean getCategory_ats(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Category_ats.toString());
	}

	/**
	 * Set value of Category_ats
	 * @param category_ats
	 */
	public final void setCategory_ats(java.lang.Boolean category_ats)
	{
		setCategory_ats(getContext(), category_ats);
	}

	/**
	 * Set value of Category_ats
	 * @param context
	 * @param category_ats
	 */
	public final void setCategory_ats(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean category_ats)
	{
		getMendixObject().setValue(context, MemberNames.Category_ats.toString(), category_ats);
	}

	/**
	 * @return value of Category_accounting
	 */
	public final java.lang.Boolean getCategory_accounting()
	{
		return getCategory_accounting(getContext());
	}

	/**
	 * @param context
	 * @return value of Category_accounting
	 */
	public final java.lang.Boolean getCategory_accounting(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Boolean) getMendixObject().getValue(context, MemberNames.Category_accounting.toString());
	}

	/**
	 * Set value of Category_accounting
	 * @param category_accounting
	 */
	public final void setCategory_accounting(java.lang.Boolean category_accounting)
	{
		setCategory_accounting(getContext(), category_accounting);
	}

	/**
	 * Set value of Category_accounting
	 * @param context
	 * @param category_accounting
	 */
	public final void setCategory_accounting(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Boolean category_accounting)
	{
		getMendixObject().setValue(context, MemberNames.Category_accounting.toString(), category_accounting);
	}

	/**
	 * @return value of AccountToken
	 */
	public final java.lang.String getAccountToken()
	{
		return getAccountToken(getContext());
	}

	/**
	 * @param context
	 * @return value of AccountToken
	 */
	public final java.lang.String getAccountToken(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.AccountToken.toString());
	}

	/**
	 * Set value of AccountToken
	 * @param accounttoken
	 */
	public final void setAccountToken(java.lang.String accounttoken)
	{
		setAccountToken(getContext(), accounttoken);
	}

	/**
	 * Set value of AccountToken
	 * @param context
	 * @param accounttoken
	 */
	public final void setAccountToken(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String accounttoken)
	{
		getMendixObject().setValue(context, MemberNames.AccountToken.toString(), accounttoken);
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return mergeConfigurationMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final merge.proxies.MergeConfiguration that = (merge.proxies.MergeConfiguration) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@java.lang.Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "Merge.MergeConfiguration";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}