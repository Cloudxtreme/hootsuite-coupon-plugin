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

package org.killbill.billing.plugin.coupon.mock;

import org.killbill.billing.catalog.api.Limit;
import org.killbill.billing.catalog.api.Product;
import org.killbill.billing.catalog.api.ProductCategory;

/**
 * Created by jgomez on 17/09/15.
 */
public class MockProduct implements Product {

    @Override
    public String getName() {
        return null;
    }

    @Override
    public boolean isRetired() {
        return false;
    }

    @Override
    public Product[] getAvailable() {
        return new Product[0];
    }

    @Override
    public Product[] getIncluded() {
        return new Product[0];
    }

    @Override
    public ProductCategory getCategory() {
        return null;
    }

    @Override
    public String getCatalogName() {
        return null;
    }

    @Override
    public Limit[] getLimits() {
        return new Limit[0];
    }

    @Override
    public boolean compliesWithLimits(final String unit, final double value) {
        return false;
    }
}
