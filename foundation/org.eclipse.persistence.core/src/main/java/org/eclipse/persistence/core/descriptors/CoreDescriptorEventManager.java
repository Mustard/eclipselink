/*
 * Copyright (c) 2012, 2021 Oracle and/or its affiliates. All rights reserved.
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
//     Blaise Doughan - 2.5 - initial implementation
package org.eclipse.persistence.core.descriptors;

/**
 * INTERNAL
 * A abstraction of descriptor event manager capturing behavior common to all
 * persistence types.
 */
public abstract class CoreDescriptorEventManager<
    DESCRIPTOR_EVENT extends CoreDescriptorEvent> {

    /**
     * Default constructor.
     */
    protected CoreDescriptorEventManager() {
    }

    public abstract void executeEvent(DESCRIPTOR_EVENT event);

    public abstract boolean hasAnyEventListeners();

}
