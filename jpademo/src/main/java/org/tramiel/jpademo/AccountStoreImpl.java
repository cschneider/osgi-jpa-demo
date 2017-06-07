/*
 *  ------------------------------------------------------------------------
 *  com.smartergridsolutions.sgsui.security.db.impl
 *  AccountStoreImpl
 *  
 *  <copyright file="AccountStoreImpl.java" company="Smarter Grid Solutions">
 *  Copyright (c) 2017 Smarter Grid Solutions. All rights reserved.
 *  </copyright>
 *  
 *  This file is the property of:
 *  
 *                     Smarter Grid Solutions
 *               http://www.smartergridsolutions.com
 *  
 *  This Source Code and the associated Documentation contain proprietary
 *  information of Smarter Grid Solutions and may not be copied or
 *  distributed in any form without the written permission of Smarter Grid
 *  Solutions.
 *  
 *  ------------------------------------------------------------------------
 */
package org.tramiel.jpademo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author smunro
 */
public class AccountStoreImpl {

    @PersistenceContext(unitName = "authentication")
    EntityManager em;

}
