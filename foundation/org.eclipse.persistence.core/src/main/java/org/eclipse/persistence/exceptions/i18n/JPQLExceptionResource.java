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
package org.eclipse.persistence.exceptions.i18n;

import java.util.ListResourceBundle;

/**
 * INTERNAL:
 * English ResourceBundle for EJBQLException.
 *
 */
public final class JPQLExceptionResource extends ListResourceBundle {
    static final Object[][] contents = {
                                           { "8001", "Syntax Recognition Problem parsing the query [{0}]. The parser returned the following [{1}]." },
                                           { "8002", "General Problem parsing the query [{0}]. The parser returned the following [{1}]." },
                                           { "8003", "The class [{0}] was not found. The parser returned the following [{1}]." },
                                           { "8004", "Error compiling the query [{0}], line {1}, column {2}: unknown identification variable [{3}]. The FROM clause of the query does not declare an identification variable [{3}]." },
                                           { "8005", "Error compiling the query [{0}]. A problem was encountered resolving the class name - The class [{1}] was not found." },
                                           { "8006", "Error compiling the query [{0}]. A problem was encountered resolving the class name - The descriptor for [{1}] was not found." },
                                           { "8007", "Error compiling the query [{0}]. A problem was encountered resolving the class name - The mapping for [{1}] was not found." },
                                           { "8008", "Error compiling the query [{0}]. A problem was encountered building the query expression - The expressionBuilder for [{1}] was not found." },
                                           { "8009", "Problem compiling the query [{0}]. The expression [{1}] is currently not supported." },
                                           { "8010", "General Problem parsing the query [{0}]." },
                                           { "8011", "Error compiling the query [{0}], line {1}, column {2}: invalid collection member declaration [{3}], expected collection valued association field." },
                                           { "8012", "Problem compiling the query [{0}]. Not yet implemented: {1}." },
                                           { "8013", "Error compiling the query [{0}], line {1}, column {2}: constructor class [{3}] not found." },
                                           { "8014", "Error compiling the query [{0}], line {1}, column {2}: invalid SIZE argument [{3}], expected collection valued association field." },
                                           { "8015", "Error compiling the query [{0}], line {1}, column {2}: invalid enum literal, the enum type {3} does not have an enum literal {4}." },
                                           { "8016", "Error compiling the query [{0}], line {1}, column {2}: invalid SELECT expression [{3}] for query with grouping [{4}]. Only aggregates, GROUP BY items or constructor expressions of these are allowed in the SELECT clause of a GROUP BY query." },
                                           { "8017", "Error compiling the query [{0}], line {1}, column {2}: invalid HAVING expression [{3}] for query with grouping [{4}]. The HAVING clause must specify search conditions over the grouping items or aggregate functions that apply to grouping items." },
                                           { "8018", "Error compiling the query [{0}], line {1}, column {2}: invalid multiple use of parameter [{3}] assuming different parameter types [{4}] and [{5}]." },
                                           { "8019", "Error compiling the query [{0}], line {1}, column {2}: multiple declaration of identification variable [{3}], previously declared as [{4} {3}]." },
                                           { "8020", "Error compiling the query [{0}], line {1}, column {2}: invalid {3} function argument [{4}], expected argument of type [{5}]." },
                                           { "8021", "Error compiling the query [{0}], line {1}, column {2}: invalid ORDER BY item [{3}] of type [{4}], expected expression of an orderable type." },
                                           { "8022", "Error compiling the query [{0}], line {1}, column {2}: invalid {3} expression argument [{4}], expected argument of type [{5}]." },
                                           { "8023", "Syntax error parsing the query [{0}]." },
                                           { "8024", "Syntax error parsing the query [{0}], line {1}, column {2}: syntax error at [{3}]." },
                                           { "8025", "Syntax error parsing the query [{0}], line {1}, column {2}: unexpected token [{3}]." },
                                           { "8026", "Syntax error parsing the query [{0}], line {1}, column {2}: unexpected char [{3}]." },
                                           { "8027", "Syntax error parsing the query [{0}], line {1}, column {2}: expected char [{3}], found [{4}]." },
                                           { "8028", "Syntax error parsing the query [{0}], line {1}, column {2}: unexpected end of query." },
                                           { "8029", "Error compiling the query [{0}], line {1}, column {2}: invalid navigation expression [{3}], cannot navigate expression [{4}] of type [{5}] inside a query." },
                                           { "8030", "Error compiling the query [{0}], line {1}, column {2}: unknown state or association field [{3}] of class [{4}]." },
                                           { "8031", "Error compiling the query [{0}], line {1}, column {2}: {3} of embedded entity {4} is not supported." },
                                           { "8032", "Error compiling the query [{0}], line {1}, column {2}: invalid access of attribute [{3}] in SET clause target [{4}], only state fields and single valued association fields may be updated in a SET clause." },
                                           { "8033", "Error compiling the query [{0}], line {1}, column {2}: invalid navigation expression [{3}], cannot navigate association field [{4}] in the SET clause target." },
                                           { "8034", "Error compiling the query [{0}]. Unknown entity type [{1}]." },
                                           { "8035", "Error compiling the query [{0}], line {1}, column {2}: invalid enum equal expression, cannot compare enum value of type [{3}} with a non enum value of type [{4}]." },
                                           { "8036", "Error compiling the query [{0}], line {1}, column {2}: invalid navigation expression [{3}], cannot navigate collection valued association field [{4}]." },
                                           { "8037", "Error compiling the query [{0}], line {1}, column {2}:  Unknown entity type [{3}]." },
                                           { "8038", "Error compiling the query [{0}], line {1}, column {2}: a problem was encountered resolving the class name - The class [{3}] was not found." },
                                           { "8039", "Error compiling the query [{0}], line {1}, column {2}: Variable {3} a not a map and a map key is being requested from it." },
                                           { "8040", "Error compiling the query [{0}], line {1}, column {2}: Alias {3} is used in the ORDER BY clause, but not defined in the query." },
                                           { "8041", "Error compiling the query [{0}], line {1}, column {2}: Index may only be used on a variable and it is being called on non-variable {3}." }

    };

    /**
     * Default constructor.
     */
    public JPQLExceptionResource() {
        // for reflection
    }

    /**
    * Return the lookup table.
    */
    @Override
    protected Object[][] getContents() {
        return contents;
    }
}
