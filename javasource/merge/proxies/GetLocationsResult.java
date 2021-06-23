// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package merge.proxies;

public class GetLocationsResult extends merge.proxies.QueryResult
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Merge.GetLocationsResult";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Next("Next"),
		Previous("Previous"),
		GetLocationsResult_Location("Merge.GetLocationsResult_Location");

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

	public GetLocationsResult(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Merge.GetLocationsResult"));
	}

	protected GetLocationsResult(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject getLocationsResultMendixObject)
	{
		super(context, getLocationsResultMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Merge.GetLocationsResult", getLocationsResultMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Merge.GetLocationsResult");
	}

	/**
	 * @deprecated Use 'GetLocationsResult.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static merge.proxies.GetLocationsResult initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return merge.proxies.GetLocationsResult.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static merge.proxies.GetLocationsResult initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new merge.proxies.GetLocationsResult(context, mendixObject);
	}

	public static merge.proxies.GetLocationsResult load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return merge.proxies.GetLocationsResult.initialize(context, mendixObject);
	}

	/**
	 * @return value of GetLocationsResult_Location
	 */
	public final java.util.List<merge.proxies.Location> getGetLocationsResult_Location() throws com.mendix.core.CoreException
	{
		return getGetLocationsResult_Location(getContext());
	}

	/**
	 * @param context
	 * @return value of GetLocationsResult_Location
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<merge.proxies.Location> getGetLocationsResult_Location(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<merge.proxies.Location> result = new java.util.ArrayList<merge.proxies.Location>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.GetLocationsResult_Location.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(merge.proxies.Location.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of GetLocationsResult_Location
	 * @param getlocationsresult_location
	 */
	public final void setGetLocationsResult_Location(java.util.List<merge.proxies.Location> getlocationsresult_location)
	{
		setGetLocationsResult_Location(getContext(), getlocationsresult_location);
	}

	/**
	 * Set value of GetLocationsResult_Location
	 * @param context
	 * @param getlocationsresult_location
	 */
	public final void setGetLocationsResult_Location(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<merge.proxies.Location> getlocationsresult_location)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (merge.proxies.Location proxyObject : getlocationsresult_location)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.GetLocationsResult_Location.toString(), identifiers);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final merge.proxies.GetLocationsResult that = (merge.proxies.GetLocationsResult) obj;
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
		return "Merge.GetLocationsResult";
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
