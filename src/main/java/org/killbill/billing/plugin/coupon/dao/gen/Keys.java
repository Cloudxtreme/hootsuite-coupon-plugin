/**
 * This class is generated by jOOQ
 */
package org.killbill.billing.plugin.coupon.dao.gen;

/**
 * A class modelling foreign key relationships between tables of the <code>killbill</code> 
 * schema
 */
@javax.annotation.Generated(
	value = {
		"http://www.jooq.org",
		"jOOQ version:3.5.0"
	},
	comments = "This class is generated by jOOQ"
)
@java.lang.SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class Keys {

	// -------------------------------------------------------------------------
	// IDENTITY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.Identity<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsRecord, org.jooq.types.UInteger> IDENTITY_COUPONS = Identities0.IDENTITY_COUPONS;
	public static final org.jooq.Identity<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsAppliedRecord, org.jooq.types.UInteger> IDENTITY_COUPONS_APPLIED = Identities0.IDENTITY_COUPONS_APPLIED;
	public static final org.jooq.Identity<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsHistoryRecord, org.jooq.types.ULong> IDENTITY_COUPONS_HISTORY = Identities0.IDENTITY_COUPONS_HISTORY;
	public static final org.jooq.Identity<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsProductsRecord, org.jooq.types.UInteger> IDENTITY_COUPONS_PRODUCTS = Identities0.IDENTITY_COUPONS_PRODUCTS;

	// -------------------------------------------------------------------------
	// UNIQUE and PRIMARY KEY definitions
	// -------------------------------------------------------------------------

	public static final org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsRecord> KEY_COUPONS_PRIMARY = UniqueKeys0.KEY_COUPONS_PRIMARY;
	public static final org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsRecord> KEY_COUPONS_COUPONS_CODE = UniqueKeys0.KEY_COUPONS_COUPONS_CODE;
	public static final org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsAppliedRecord> KEY_COUPONS_APPLIED_PRIMARY = UniqueKeys0.KEY_COUPONS_APPLIED_PRIMARY;
	public static final org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsAppliedRecord> KEY_COUPONS_APPLIED_COUPONS_APPLIED_UNIQUE = UniqueKeys0.KEY_COUPONS_APPLIED_COUPONS_APPLIED_UNIQUE;
	public static final org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsHistoryRecord> KEY_COUPONS_HISTORY_PRIMARY = UniqueKeys0.KEY_COUPONS_HISTORY_PRIMARY;
	public static final org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsHistoryRecord> KEY_COUPONS_HISTORY_RECORD_ID = UniqueKeys0.KEY_COUPONS_HISTORY_RECORD_ID;
	public static final org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsProductsRecord> KEY_COUPONS_PRODUCTS_PRIMARY = UniqueKeys0.KEY_COUPONS_PRODUCTS_PRIMARY;
	public static final org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsProductsRecord> KEY_COUPONS_PRODUCTS_COUPONS_PRODUCTS_UNIQUE = UniqueKeys0.KEY_COUPONS_PRODUCTS_COUPONS_PRODUCTS_UNIQUE;

	// -------------------------------------------------------------------------
	// FOREIGN KEY definitions
	// -------------------------------------------------------------------------


	// -------------------------------------------------------------------------
	// [#1459] distribute members to avoid static initialisers > 64kb
	// -------------------------------------------------------------------------

	private static class Identities0 extends org.jooq.impl.AbstractKeys {
		public static org.jooq.Identity<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsRecord, org.jooq.types.UInteger> IDENTITY_COUPONS = createIdentity(org.killbill.billing.plugin.coupon.dao.gen.tables.Coupons.COUPONS, org.killbill.billing.plugin.coupon.dao.gen.tables.Coupons.COUPONS.RECORD_ID);
		public static org.jooq.Identity<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsAppliedRecord, org.jooq.types.UInteger> IDENTITY_COUPONS_APPLIED = createIdentity(org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsApplied.COUPONS_APPLIED, org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsApplied.COUPONS_APPLIED.RECORD_ID);
		public static org.jooq.Identity<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsHistoryRecord, org.jooq.types.ULong> IDENTITY_COUPONS_HISTORY = createIdentity(org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsHistory.COUPONS_HISTORY, org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsHistory.COUPONS_HISTORY.RECORD_ID);
		public static org.jooq.Identity<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsProductsRecord, org.jooq.types.UInteger> IDENTITY_COUPONS_PRODUCTS = createIdentity(org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsProducts.COUPONS_PRODUCTS, org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsProducts.COUPONS_PRODUCTS.RECORD_ID);
	}

	private static class UniqueKeys0 extends org.jooq.impl.AbstractKeys {
		public static final org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsRecord> KEY_COUPONS_PRIMARY = createUniqueKey(org.killbill.billing.plugin.coupon.dao.gen.tables.Coupons.COUPONS, org.killbill.billing.plugin.coupon.dao.gen.tables.Coupons.COUPONS.RECORD_ID);
		public static final org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsRecord> KEY_COUPONS_COUPONS_CODE = createUniqueKey(org.killbill.billing.plugin.coupon.dao.gen.tables.Coupons.COUPONS, org.killbill.billing.plugin.coupon.dao.gen.tables.Coupons.COUPONS.COUPON_CODE);
		public static final org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsAppliedRecord> KEY_COUPONS_APPLIED_PRIMARY = createUniqueKey(org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsApplied.COUPONS_APPLIED, org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsApplied.COUPONS_APPLIED.RECORD_ID);
		public static final org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsAppliedRecord> KEY_COUPONS_APPLIED_COUPONS_APPLIED_UNIQUE = createUniqueKey(org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsApplied.COUPONS_APPLIED, org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsApplied.COUPONS_APPLIED.COUPON_CODE, org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsApplied.COUPONS_APPLIED.KB_SUBSCRIPTION_ID);
		public static final org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsHistoryRecord> KEY_COUPONS_HISTORY_PRIMARY = createUniqueKey(org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsHistory.COUPONS_HISTORY, org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsHistory.COUPONS_HISTORY.RECORD_ID);
		public static final org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsHistoryRecord> KEY_COUPONS_HISTORY_RECORD_ID = createUniqueKey(org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsHistory.COUPONS_HISTORY, org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsHistory.COUPONS_HISTORY.RECORD_ID);
		public static final org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsProductsRecord> KEY_COUPONS_PRODUCTS_PRIMARY = createUniqueKey(org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsProducts.COUPONS_PRODUCTS, org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsProducts.COUPONS_PRODUCTS.RECORD_ID);
		public static final org.jooq.UniqueKey<org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsProductsRecord> KEY_COUPONS_PRODUCTS_COUPONS_PRODUCTS_UNIQUE = createUniqueKey(org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsProducts.COUPONS_PRODUCTS, org.killbill.billing.plugin.coupon.dao.gen.tables.CouponsProducts.COUPONS_PRODUCTS.COUPON_CODE);
	}
}
