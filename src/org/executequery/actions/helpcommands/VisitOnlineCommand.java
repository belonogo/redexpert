/*
 * VisitOnlineCommand.java
 *
 * Copyright (C) 2002-2010 Takis Diakoumis
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 3
 * of the License, or any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program. If not, see <http://www.gnu.org/licenses/>.
 *
 */

package org.executequery.actions.helpcommands;

import org.executequery.actions.AbstractUrlLauncherCommand;

/** 
 * Executes the Help | Visit executequery.org command.<br>
 * This will open a browser window with URL http://executequery.org.
 *
 * @author   Takis Diakoumis
 * @version  $Revision: 1514 $
 * @date     $Date: 2009-04-10 15:42:56 +1000 (Fri, 10 Apr 2009) $
 */
public class VisitOnlineCommand extends AbstractUrlLauncherCommand {

    private static final String URL = "http://executequery.org";

    @Override
    public String url() {

        return URL;
    }

}







