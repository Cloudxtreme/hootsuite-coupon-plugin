/**
 * This class is generated by jOOQ
 */
package org.killbill.billing.plugin.coupon.dao.gen.tables.records;

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
public class CouponsRecord extends org.jooq.impl.UpdatableRecordImpl<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsRecord> implements org.jooq.Record6<org.jooq.types.UInteger, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.String> {

	private static final long serialVersionUID = 519194812;

	/**
	 * Setter for <code>killbill.coupons.record_id</code>.
	 */
	public void setRecordId(org.jooq.types.UInteger value) {
		setValue(0, value);
	}

	/**
	 * Getter for <code>killbill.coupons.record_id</code>.
	 */
	public org.jooq.types.UInteger getRecordId() {
		return (org.jooq.types.UInteger) getValue(0);
	}

	/**
	 * Setter for <code>killbill.coupons.coupon_code</code>.
	 */
	public void setCouponCode(java.lang.String value) {
		setValue(1, value);
	}

	/**
	 * Getter for <code>killbill.coupons.coupon_code</code>.
	 */
	public java.lang.String getCouponCode() {
		return (java.lang.String) getValue(1);
	}

	/**
	 * Setter for <code>killbill.coupons.coupon_name</code>.
	 */
	public void setCouponName(java.lang.String value) {
		setValue(2, value);
	}

	/**
	 * Getter for <code>killbill.coupons.coupon_name</code>.
	 */
	public java.lang.String getCouponName() {
		return (java.lang.String) getValue(2);
	}

	/**
	 * Setter for <code>killbill.coupons.discount_type</code>.
	 */
	public void setDiscountType(java.lang.String value) {
		setValue(3, value);
	}

	/**
	 * Getter for <code>killbill.coupons.discount_type</code>.
	 */
	public java.lang.String getDiscountType() {
		return (java.lang.String) getValue(3);
	}

	/**
	 * Setter for <code>killbill.coupons.percentage_discount</code>.
	 */
	public void setPercentageDiscount(java.lang.Double value) {
		setValue(4, value);
	}

	/**
	 * Getter for <code>killbill.coupons.percentage_discount</code>.
	 */
	public java.lang.Double getPercentageDiscount() {
		return (java.lang.Double) getValue(4);
	}

	/**
	 * Setter for <code>killbill.coupons.kb_tenant_id</code>.
	 */
	public void setKbTenantId(java.lang.String value) {
		setValue(5, value);
	}

	/**
	 * Getter for <code>killbill.coupons.kb_tenant_id</code>.
	 */
	public java.lang.String getKbTenantId() {
		return (java.lang.String) getValue(5);
	}

	// -------------------------------------------------------------------------
	// Primary key information
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Record1<org.jooq.types.UInteger> key() {
		return (org.jooq.Record1) super.key();
	}

	// -------------------------------------------------------------------------
	// Record6 type implementation
	// -------------------------------------------------------------------------

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<org.jooq.types.UInteger, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.String> fieldsRow() {
		return (org.jooq.Row6) super.fieldsRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Row6<org.jooq.types.UInteger, java.lang.String, java.lang.String, java.lang.String, java.lang.Double, java.lang.String> valuesRow() {
		return (org.jooq.Row6) super.valuesRow();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<org.jooq.types.UInteger> field1() {
		return org.killbill.billing.plugin.coupon.dao.gen.tables.Coupons.COUPONS.RECORD_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field2() {
		return org.killbill.billing.plugin.coupon.dao.gen.tables.Coupons.COUPONS.COUPON_CODE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field3() {
		return org.killbill.billing.plugin.coupon.dao.gen.tables.Coupons.COUPONS.COUPON_NAME;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field4() {
		return org.killbill.billing.plugin.coupon.dao.gen.tables.Coupons.COUPONS.DISCOUNT_TYPE;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.Double> field5() {
		return org.killbill.billing.plugin.coupon.dao.gen.tables.Coupons.COUPONS.PERCENTAGE_DISCOUNT;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.Field<java.lang.String> field6() {
		return org.killbill.billing.plugin.coupon.dao.gen.tables.Coupons.COUPONS.KB_TENANT_ID;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public org.jooq.types.UInteger value1() {
		return getRecordId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value2() {
		return getCouponCode();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value3() {
		return getCouponName();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value4() {
		return getDiscountType();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.Double value5() {
		return getPercentageDiscount();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public java.lang.String value6() {
		return getKbTenantId();
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CouponsRecord value1(org.jooq.types.UInteger value) {
		setRecordId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CouponsRecord value2(java.lang.String value) {
		setCouponCode(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CouponsRecord value3(java.lang.String value) {
		setCouponName(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CouponsRecord value4(java.lang.String value) {
		setDiscountType(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CouponsRecord value5(java.lang.Double value) {
		setPercentageDiscount(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CouponsRecord value6(java.lang.String value) {
		setKbTenantId(value);
		return this;
	}

	/**
	 * {@inheritDoc}
	 */
	@Override
	public CouponsRecord values(org.jooq.types.UInteger value1, java.lang.String value2, java.lang.String value3, java.lang.String value4, java.lang.Double value5, java.lang.String value6) {
		return this;
	}

	// -------------------------------------------------------------------------
	// Constructors
	// -------------------------------------------------------------------------

	/**
	 * Create a detached CouponsRecord
	 */
	public CouponsRecord() {
		super(org.killbill.billing.plugin.coupon.dao.gen.tables.Coupons.COUPONS);
	}

	/**
	 * Create a detached, initialised CouponsRecord
	 */
	public CouponsRecord(org.jooq.types.UInteger recordId, java.lang.String couponCode, java.lang.String couponName, java.lang.String discountType, java.lang.Double percentageDiscount, java.lang.String kbTenantId) {
		super(org.killbill.billing.plugin.coupon.dao.gen.tables.Coupons.COUPONS);

		setValue(0, recordId);
		setValue(1, couponCode);
		setValue(2, couponName);
		setValue(3, discountType);
		setValue(4, percentageDiscount);
		setValue(5, kbTenantId);
	}
}
