// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package merge.proxies;

public class GetLocationsParam extends merge.proxies.QueryParams
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Merge.GetLocationsParam";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		AccountToken("AccountToken"),
		CreatedAfter("CreatedAfter"),
		CreatedBefore("CreatedBefore"),
		Cursor("Cursor"),
		IncludeRemoteData("IncludeRemoteData"),
		ModifiedAfter("ModifiedAfter"),
		ModifiedBefore("ModifiedBefore"),
		PageSize("PageSize"),
		RemoteId("RemoteId");

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

	public GetLocationsParam(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Merge.GetLocationsParam"));
	}

	protected GetLocationsParam(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject getLocationsParamMendixObject)
	{
		super(context, getLocationsParamMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Merge.GetLocationsParam", getLocationsParamMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Merge.GetLocationsParam");
	}

	/**
	 * @deprecated Use 'GetLocationsParam.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static merge.proxies.GetLocationsParam initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return merge.proxies.GetLocationsParam.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static merge.proxies.GetLocationsParam initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new merge.proxies.GetLocationsParam(context, mendixObject);
	}

	public static merge.proxies.GetLocationsParam load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return merge.proxies.GetLocationsParam.initialize(context, mendixObject);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final merge.proxies.GetLocationsParam that = (merge.proxies.GetLocationsParam) obj;
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
		return "Merge.GetLocationsParam";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@java.lang.Override
	@java.lang.Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}