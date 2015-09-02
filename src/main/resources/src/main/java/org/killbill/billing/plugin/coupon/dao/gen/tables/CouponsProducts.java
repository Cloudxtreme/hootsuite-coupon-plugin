/**
 * This class is generated by jOOQ
 */
package org.killbill.billing.plugin.coupon.dao.gen.tables;

/**
 * This class is generated by jOOQ.
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class CouponsProducts extends org.jooq.impl.TableImpl<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsProductsRecord> {

	private static final long serialVersionUID = -407933298;

	/**
	 * The reference instance of <code>killbill.coupons_products</code>
	 */
	public static final org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsProducts COUPONS_PRODUCTS = new org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsProducts();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsProductsRecord> getRecordType() {
		return org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsProductsRecord.class;
	}

	/**
	 * The column <code>killbill.coupons_products.record_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsProductsRecord, org.jooq.types.UInteger> RECORD_ID = createField("record_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>killbill.coupons_products.coupon_code</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsProductsRecord, java.lang.String> COUPON_CODE = createField("coupon_code", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>killbill.coupons_products.product_name</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsProductsRecord, java.lang.String> PRODUCT_NAME = createField("product_name", org.jooq.impl.SQLDataType.VARCHAR.length(50).nullable(false), this, "");

	/**
	 * The column <code>killbill.coupons_products.kb_tenant_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsProductsRecord, java.lang.String> KB_TENANT_ID = createField("kb_tenant_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

	/**
	 * Create a <code>killbill.coupons_products</code> table reference
	 */
	public CouponsProducts() {
		this("coupons_products", null);
	}

	/**
	 * Create an aliased <code>killbill.coupons_products</code> table reference
	 */
	public CouponsProducts(java.lang.String alias) {
		this(alias, org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsProducts.COUPONS_PRODUCTS);
	}

	private CouponsProducts(java.lang.String alias, org.jooq.Table<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsProductsRecord> aliased) {
		this(alias, aliased, null);
	}

	private CouponsProducts(java.lang.String alias, org.jooq.Table<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsProductsRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.killbill.billing.plugin.coupon.dao.gen.Killbill.KILLBILL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsProductsRecord, org.jooq.types.UInteger> getIdentity() {
		return org.killbill.billing.plugin.coupon.dao.gen.Keys.IDENTITY_COUPONS_PRODUCTS;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsProductsRecord> getPrimaryKey() {
		return org.killbill.billing.plugin.coupon.dao.gen.Keys.KEY_COUPONS_PRODUCTS_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsProductsRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsProductsRecord>>asList(org.killbill.billing.plugin.coupon.dao.gen.Keys.KEY_COUPONS_PRODUCTS_PRIMARY);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsProducts as(java.lang.String alias) {
		return new org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsProducts(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsProducts rename(java.lang.String name) {
		return new org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsProducts(name, null);
	}
}
