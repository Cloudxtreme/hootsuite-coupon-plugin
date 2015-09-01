/*
 * Copyright 2014-2015 Groupon, Inc
 * Copyright 2014-2015 The Billing Project, LLC
 *
 * The Billing Project licenses this file to you under the Apache License, version 2.0
 * (the "License"); you may not use this file except in compliance with the
 * License.  You may obtain a copy of the License at:
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.  See the
 * License for the specific language governing permissions and limitations
 * under the License.
 */

package org.killbill.billing.plugin.coupon.api;

import java.sql.SQLException;

import org.killbill.billing.plugin.coupon.CouponJson;
import org.killbill.billing.plugin.coupon.dao.CouponDao;
import org.killbill.billing.plugin.coupon.dao.gen.tables.records.CouponsRecord;

public class CouponPluginApi {

    private final CouponDao dao;

    public CouponPluginApi(final CouponDao dao) {
        this.dao = dao;
    }

    public CouponsRecord getCouponByCode(final String couponCode) throws SQLException {
        return dao.getCouponByCode(couponCode);
    }

    public void createCoupon(final CouponJson couponJson) throws SQLException {
        dao.createCoupon(couponJson);
    }
}