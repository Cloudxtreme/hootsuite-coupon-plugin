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
public class CouponsApplied extends org.jooq.impl.TableImpl<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsAppliedRecord> {

	private static final long serialVersionUID = -1312973173;

	/**
	 * The reference instance of <code>killbill.coupons_applied</code>
	 */
	public static final org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsApplied COUPONS_APPLIED = new org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsApplied();

	/**
	 * The class holding records for this type
	 */
	@Override
	public java.lang.Class<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsAppliedRecord> getRecordType() {
		return org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsAppliedRecord.class;
	}

	/**
	 * The column <code>killbill.coupons_applied.record_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsAppliedRecord, org.jooq.types.UInteger> RECORD_ID = createField("record_id", org.jooq.impl.SQLDataType.INTEGERUNSIGNED.nullable(false), this, "");

	/**
	 * The column <code>killbill.coupons_applied.coupon_code</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsAppliedRecord, java.lang.String> COUPON_CODE = createField("coupon_code", org.jooq.impl.SQLDataType.VARCHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>killbill.coupons_applied.kb_account_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsAppliedRecord, java.lang.String> KB_ACCOUNT_ID = createField("kb_account_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

	/**
	 * The column <code>killbill.coupons_applied.kb_tenant_id</code>.
	 */
	public final org.jooq.TableField<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsAppliedRecord, java.lang.String> KB_TENANT_ID = createField("kb_tenant_id", org.jooq.impl.SQLDataType.CHAR.length(36).nullable(false), this, "");

	/**
	 * Create a <code>killbill.coupons_applied</code> table reference
	 */
	public CouponsApplied() {
		this("coupons_applied", null);
	}

	/**
	 * Create an aliased <code>killbill.coupons_applied</code> table reference
	 */
	public CouponsApplied(java.lang.String alias) {
		this(alias, org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsApplied.COUPONS_APPLIED);
	}

	private CouponsApplied(java.lang.String alias, org.jooq.Table<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsAppliedRecord> aliased) {
		this(alias, aliased, null);
	}

	private CouponsApplied(java.lang.String alias, org.jooq.Table<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsAppliedRecord> aliased, org.jooq.Field<?>[] parameters) {
		super(alias, org.killbill.billing.plugin.coupon.dao.gen.Killbill.KILLBILL, aliased, parameters, "");
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Identity<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsAppliedRecord, org.jooq.types.UInteger> getIdentity() {
		return org.killbill.billing.plugin.coupon.dao.gen.Keys.IDENTITY_COUPONS_APPLIED;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsAppliedRecord> getPrimaryKey() {
		return org.killbill.billing.plugin.coupon.dao.gen.Keys.KEY_COUPONS_APPLIED_PRIMARY;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.util.List<org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsAppliedRecord>> getKeys() {
		return java.util.Arrays.<org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsAppliedRecord>>asList(org.killbill.billing.plugin.coupon.dao.gen.Keys.KEY_COUPONS_APPLIED_PRIMARY, org.killbill.billing.plugin.coupon.dao.gen.Keys.KEY_COUPONS_APPLIED_COUPONS_APPLIED_CODE, org.killbill.billing.plugin.coupon.dao.gen.Keys.KEY_COUPONS_APPLIED_COUPONS_APPLIED_ACCOUNT);
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsApplied as(java.lang.String alias) {
		return new org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsApplied(alias, this);
	}

	/**
	 * Rename this table
	 */
	public org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsApplied rename(java.lang.String name) {
		return new org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsApplied(name, null);
	}
}
