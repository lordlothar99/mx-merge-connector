// This file was generated by Mendix Studio Pro.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package merge.proxies;

public class LocationsListResult extends merge.proxies.QueryResult
{
	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "Merge.LocationsListResult";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Next("Next"),
		Previous("Previous"),
		LocationsListResult_Location("Merge.LocationsListResult_Location");

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

	public LocationsListResult(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "Merge.LocationsListResult"));
	}

	protected LocationsListResult(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject locationsListResultMendixObject)
	{
		super(context, locationsListResultMendixObject);
		if (!com.mendix.core.Core.isSubClassOf("Merge.LocationsListResult", locationsListResultMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a Merge.LocationsListResult");
	}

	/**
	 * @deprecated Use 'LocationsListResult.load(IContext, IMendixIdentifier)' instead.
	 */
	@java.lang.Deprecated
	public static merge.proxies.LocationsListResult initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return merge.proxies.LocationsListResult.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static merge.proxies.LocationsListResult initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new merge.proxies.LocationsListResult(context, mendixObject);
	}

	public static merge.proxies.LocationsListResult load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return merge.proxies.LocationsListResult.initialize(context, mendixObject);
	}

	/**
	 * @return value of LocationsListResult_Location
	 */
	public final java.util.List<merge.proxies.Location> getLocationsListResult_Location() throws com.mendix.core.CoreException
	{
		return getLocationsListResult_Location(getContext());
	}

	/**
	 * @param context
	 * @return value of LocationsListResult_Location
	 */
	@SuppressWarnings("unchecked")
	public final java.util.List<merge.proxies.Location> getLocationsListResult_Location(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		java.util.List<merge.proxies.Location> result = new java.util.ArrayList<merge.proxies.Location>();
		Object valueObject = getMendixObject().getValue(context, MemberNames.LocationsListResult_Location.toString());
		if (valueObject == null)
			return result;
		for (com.mendix.systemwideinterfaces.core.IMendixObject mendixObject : com.mendix.core.Core.retrieveIdList(context, (java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier>) valueObject))
			result.add(merge.proxies.Location.initialize(context, mendixObject));
		return result;
	}

	/**
	 * Set value of LocationsListResult_Location
	 * @param locationslistresult_location
	 */
	public final void setLocationsListResult_Location(java.util.List<merge.proxies.Location> locationslistresult_location)
	{
		setLocationsListResult_Location(getContext(), locationslistresult_location);
	}

	/**
	 * Set value of LocationsListResult_Location
	 * @param context
	 * @param locationslistresult_location
	 */
	public final void setLocationsListResult_Location(com.mendix.systemwideinterfaces.core.IContext context, java.util.List<merge.proxies.Location> locationslistresult_location)
	{
		java.util.List<com.mendix.systemwideinterfaces.core.IMendixIdentifier> identifiers = new java.util.ArrayList<com.mendix.systemwideinterfaces.core.IMendixIdentifier>();
		for (merge.proxies.Location proxyObject : locationslistresult_location)
			identifiers.add(proxyObject.getMendixObject().getId());
		getMendixObject().setValue(context, MemberNames.LocationsListResult_Location.toString(), identifiers);
	}

	@java.lang.Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final merge.proxies.LocationsListResult that = (merge.proxies.LocationsListResult) obj;
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
		return "Merge.LocationsListResult";
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
