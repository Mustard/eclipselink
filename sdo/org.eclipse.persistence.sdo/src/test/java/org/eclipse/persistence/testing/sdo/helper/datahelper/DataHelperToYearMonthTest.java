/*
 * Copyright (c) 1998, 2021 Oracle and/or its affiliates. All rights reserved.
 *
 * This program and the accompanying materials are made available under the
 * terms of the Eclipse Public License v. 2.0 which is available at
 * http://www.eclipse.org/legal/epl-2.0,
 * or the Eclipse Distribution License v. 1.0 which is available at
 * http://www.eclipse.org/org/documents/edl-v10.php.
 *
 * SPDX-License-Identifier: EPL-2.0 OR BSD-3-Clause
 */

// Contributors:
//     Oracle - initial API and implementation from Oracle TopLink
package org.eclipse.persistence.testing.sdo.helper.datahelper;

import junit.framework.TestCase;

import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;

public class DataHelperToYearMonthTest extends DataHelperTestCases {
    public DataHelperToYearMonthTest(String name) {
        super(name);
    }

    public void testToYearMonthWithFullSetting() {
        Calendar controlCalendar = Calendar.getInstance();
        controlCalendar.clear();
        controlCalendar.set(Calendar.YEAR, 2001);
        controlCalendar.set(Calendar.MONTH, 4);
        controlCalendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date controlDate = controlCalendar.getTime();
        String tm = dataHelper.toYearMonth(controlDate);
        assertEquals("2001-05", tm);
    }

    public void testToYearMonthWithDefault() {
        Calendar controlCalendar = Calendar.getInstance();
        controlCalendar.clear();
        controlCalendar.setTimeZone(TimeZone.getTimeZone("GMT"));
        Date controlDate = controlCalendar.getTime();
        String tm = dataHelper.toYearMonth(controlDate);
        assertEquals("1970-01", tm);
    }

    public void testToYearMonthWithNullInput() {
        Date controlDate = null;
        String tm = dataHelper.toYearMonth(controlDate);
        assertNull(tm);
    }
}
