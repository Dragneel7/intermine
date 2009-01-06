package org.intermine.web.logic.widget;

/*
 * Copyright (C) 2002-2009 FlyMine
 *
 * This code may be freely distributed and modified under the
 * terms of the GNU Lesser General Public Licence.  This should
 * be distributed with the code.  See the LICENSE file for more
 * information or http://www.gnu.org/copyleft/lesser.html.
 *
 */

import org.intermine.pathquery.PathQuery;

/**
 * Builds a pathquery based on a widget.
 * @author Julie Sullivan
 */
public interface WidgetURLQuery
{
    /**
     * the pathquery is built to return all objects that the
     * user selected from the widget.  This happens when the user checks some checkboxes on the
     * widget and clicks on the 'display' button.
     *
     * @return the query generated based on which records the user clicked on in the widget
     */
    public PathQuery generatePathQuery();

}
