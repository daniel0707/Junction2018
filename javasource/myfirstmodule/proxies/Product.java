// This file was generated by Mendix Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public class Product
{
	private final com.mendix.systemwideinterfaces.core.IMendixObject productMendixObject;

	private final com.mendix.systemwideinterfaces.core.IContext context;

	/**
	 * Internal name of this entity
	 */
	public static final java.lang.String entityName = "MyFirstModule.Product";

	/**
	 * Enum describing members of this entity
	 */
	public enum MemberNames
	{
		Name("Name"),
		Price("Price"),
		Product_ID("Product_ID"),
		ProductOwner("ProductOwner"),
		Product_Transaction("MyFirstModule.Product_Transaction"),
		Product_Merchant("MyFirstModule.Product_Merchant");

		private java.lang.String metaName;

		MemberNames(java.lang.String s)
		{
			metaName = s;
		}

		@Override
		public java.lang.String toString()
		{
			return metaName;
		}
	}

	public Product(com.mendix.systemwideinterfaces.core.IContext context)
	{
		this(context, com.mendix.core.Core.instantiate(context, "MyFirstModule.Product"));
	}

	protected Product(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject productMendixObject)
	{
		if (productMendixObject == null)
			throw new java.lang.IllegalArgumentException("The given object cannot be null.");
		if (!com.mendix.core.Core.isSubClassOf("MyFirstModule.Product", productMendixObject.getType()))
			throw new java.lang.IllegalArgumentException("The given object is not a MyFirstModule.Product");

		this.productMendixObject = productMendixObject;
		this.context = context;
	}

	/**
	 * @deprecated Use 'Product.load(IContext, IMendixIdentifier)' instead.
	 */
	@Deprecated
	public static myfirstmodule.proxies.Product initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		return myfirstmodule.proxies.Product.load(context, mendixIdentifier);
	}

	/**
	 * Initialize a proxy using context (recommended). This context will be used for security checking when the get- and set-methods without context parameters are called.
	 * The get- and set-methods with context parameter should be used when for instance sudo access is necessary (IContext.createSudoClone() can be used to obtain sudo access).
	 */
	public static myfirstmodule.proxies.Product initialize(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixObject mendixObject)
	{
		return new myfirstmodule.proxies.Product(context, mendixObject);
	}

	public static myfirstmodule.proxies.Product load(com.mendix.systemwideinterfaces.core.IContext context, com.mendix.systemwideinterfaces.core.IMendixIdentifier mendixIdentifier) throws com.mendix.core.CoreException
	{
		com.mendix.systemwideinterfaces.core.IMendixObject mendixObject = com.mendix.core.Core.retrieveId(context, mendixIdentifier);
		return myfirstmodule.proxies.Product.initialize(context, mendixObject);
	}

	public static java.util.List<myfirstmodule.proxies.Product> load(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String xpathConstraint) throws com.mendix.core.CoreException
	{
		java.util.List<myfirstmodule.proxies.Product> result = new java.util.ArrayList<myfirstmodule.proxies.Product>();
		for (com.mendix.systemwideinterfaces.core.IMendixObject obj : com.mendix.core.Core.retrieveXPathQuery(context, "//MyFirstModule.Product" + xpathConstraint))
			result.add(myfirstmodule.proxies.Product.initialize(context, obj));
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
	 * @return value of Name
	 */
	public final java.lang.String getName()
	{
		return getName(getContext());
	}

	/**
	 * @param context
	 * @return value of Name
	 */
	public final java.lang.String getName(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.String) getMendixObject().getValue(context, MemberNames.Name.toString());
	}

	/**
	 * Set value of Name
	 * @param name
	 */
	public final void setName(java.lang.String name)
	{
		setName(getContext(), name);
	}

	/**
	 * Set value of Name
	 * @param context
	 * @param name
	 */
	public final void setName(com.mendix.systemwideinterfaces.core.IContext context, java.lang.String name)
	{
		getMendixObject().setValue(context, MemberNames.Name.toString(), name);
	}

	/**
	 * @return value of Price
	 */
	public final java.math.BigDecimal getPrice()
	{
		return getPrice(getContext());
	}

	/**
	 * @param context
	 * @return value of Price
	 */
	public final java.math.BigDecimal getPrice(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.math.BigDecimal) getMendixObject().getValue(context, MemberNames.Price.toString());
	}

	/**
	 * Set value of Price
	 * @param price
	 */
	public final void setPrice(java.math.BigDecimal price)
	{
		setPrice(getContext(), price);
	}

	/**
	 * Set value of Price
	 * @param context
	 * @param price
	 */
	public final void setPrice(com.mendix.systemwideinterfaces.core.IContext context, java.math.BigDecimal price)
	{
		getMendixObject().setValue(context, MemberNames.Price.toString(), price);
	}

	/**
	 * @return value of Product_ID
	 */
	public final java.lang.Long getProduct_ID()
	{
		return getProduct_ID(getContext());
	}

	/**
	 * @param context
	 * @return value of Product_ID
	 */
	public final java.lang.Long getProduct_ID(com.mendix.systemwideinterfaces.core.IContext context)
	{
		return (java.lang.Long) getMendixObject().getValue(context, MemberNames.Product_ID.toString());
	}

	/**
	 * Set value of Product_ID
	 * @param product_id
	 */
	public final void setProduct_ID(java.lang.Long product_id)
	{
		setProduct_ID(getContext(), product_id);
	}

	/**
	 * Set value of Product_ID
	 * @param context
	 * @param product_id
	 */
	public final void setProduct_ID(com.mendix.systemwideinterfaces.core.IContext context, java.lang.Long product_id)
	{
		getMendixObject().setValue(context, MemberNames.Product_ID.toString(), product_id);
	}

	/**
	 * Set value of ProductOwner
	 * @param productowner
	 */
	public final myfirstmodule.proxies.Enumeration getProductOwner()
	{
		return getProductOwner(getContext());
	}

	/**
	 * @param context
	 * @return value of ProductOwner
	 */
	public final myfirstmodule.proxies.Enumeration getProductOwner(com.mendix.systemwideinterfaces.core.IContext context)
	{
		Object obj = getMendixObject().getValue(context, MemberNames.ProductOwner.toString());
		if (obj == null)
			return null;

		return myfirstmodule.proxies.Enumeration.valueOf((java.lang.String) obj);
	}

	/**
	 * Set value of ProductOwner
	 * @param productowner
	 */
	public final void setProductOwner(myfirstmodule.proxies.Enumeration productowner)
	{
		setProductOwner(getContext(), productowner);
	}

	/**
	 * Set value of ProductOwner
	 * @param context
	 * @param productowner
	 */
	public final void setProductOwner(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Enumeration productowner)
	{
		if (productowner != null)
			getMendixObject().setValue(context, MemberNames.ProductOwner.toString(), productowner.toString());
		else
			getMendixObject().setValue(context, MemberNames.ProductOwner.toString(), null);
	}

	/**
	 * @return value of Product_Transaction
	 */
	public final myfirstmodule.proxies.Transaction getProduct_Transaction() throws com.mendix.core.CoreException
	{
		return getProduct_Transaction(getContext());
	}

	/**
	 * @param context
	 * @return value of Product_Transaction
	 */
	public final myfirstmodule.proxies.Transaction getProduct_Transaction(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Transaction result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Product_Transaction.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Transaction.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Product_Transaction
	 * @param product_transaction
	 */
	public final void setProduct_Transaction(myfirstmodule.proxies.Transaction product_transaction)
	{
		setProduct_Transaction(getContext(), product_transaction);
	}

	/**
	 * Set value of Product_Transaction
	 * @param context
	 * @param product_transaction
	 */
	public final void setProduct_Transaction(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Transaction product_transaction)
	{
		if (product_transaction == null)
			getMendixObject().setValue(context, MemberNames.Product_Transaction.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Product_Transaction.toString(), product_transaction.getMendixObject().getId());
	}

	/**
	 * @return value of Product_Merchant
	 */
	public final myfirstmodule.proxies.Merchant getProduct_Merchant() throws com.mendix.core.CoreException
	{
		return getProduct_Merchant(getContext());
	}

	/**
	 * @param context
	 * @return value of Product_Merchant
	 */
	public final myfirstmodule.proxies.Merchant getProduct_Merchant(com.mendix.systemwideinterfaces.core.IContext context) throws com.mendix.core.CoreException
	{
		myfirstmodule.proxies.Merchant result = null;
		com.mendix.systemwideinterfaces.core.IMendixIdentifier identifier = getMendixObject().getValue(context, MemberNames.Product_Merchant.toString());
		if (identifier != null)
			result = myfirstmodule.proxies.Merchant.load(context, identifier);
		return result;
	}

	/**
	 * Set value of Product_Merchant
	 * @param product_merchant
	 */
	public final void setProduct_Merchant(myfirstmodule.proxies.Merchant product_merchant)
	{
		setProduct_Merchant(getContext(), product_merchant);
	}

	/**
	 * Set value of Product_Merchant
	 * @param context
	 * @param product_merchant
	 */
	public final void setProduct_Merchant(com.mendix.systemwideinterfaces.core.IContext context, myfirstmodule.proxies.Merchant product_merchant)
	{
		if (product_merchant == null)
			getMendixObject().setValue(context, MemberNames.Product_Merchant.toString(), null);
		else
			getMendixObject().setValue(context, MemberNames.Product_Merchant.toString(), product_merchant.getMendixObject().getId());
	}

	/**
	 * @return the IMendixObject instance of this proxy for use in the Core interface.
	 */
	public final com.mendix.systemwideinterfaces.core.IMendixObject getMendixObject()
	{
		return productMendixObject;
	}

	/**
	 * @return the IContext instance of this proxy, or null if no IContext instance was specified at initialization.
	 */
	public final com.mendix.systemwideinterfaces.core.IContext getContext()
	{
		return context;
	}

	@Override
	public boolean equals(Object obj)
	{
		if (obj == this)
			return true;

		if (obj != null && getClass().equals(obj.getClass()))
		{
			final myfirstmodule.proxies.Product that = (myfirstmodule.proxies.Product) obj;
			return getMendixObject().equals(that.getMendixObject());
		}
		return false;
	}

	@Override
	public int hashCode()
	{
		return getMendixObject().hashCode();
	}

	/**
	 * @return String name of this class
	 */
	public static java.lang.String getType()
	{
		return "MyFirstModule.Product";
	}

	/**
	 * @return String GUID from this object, format: ID_0000000000
	 * @deprecated Use getMendixObject().getId().toLong() to get a unique identifier for this object.
	 */
	@Deprecated
	public java.lang.String getGUID()
	{
		return "ID_" + getMendixObject().getId().toLong();
	}
}
