/*
 * This file is a part of the SchemaSpy project (http://schemaspy.org).
 * Copyright (C) 2004, 2005, 2006, 2007, 2008, 2009, 2010, 2011 John Currier
 *
 * SchemaSpy is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * SchemaSpy is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301  USA
 */
package org.schemaspy.view;

import java.util.Set;
import org.schemaspy.model.Database;
import org.schemaspy.model.Table;

/**
 * Implementations of this interface know how to take SQL and format it
 * into (hopefully) readable HTML.
 *
 * @author John Currier
 */
public interface SqlFormatter {
    /**
     * Return a HTML-formatted representation of the specified SQL.
     *
     * @param sql SQL to be formatted
     * @param db Database
     * @param references set of tables referenced by this SQL
     *      (populated by the formatter) or left empty if the formatter already
     *      provides references to those tables
     * @return HTML-formatted representation of the specified SQL
     */
    String format(String sql, Database db, Set<Table> references);
}
