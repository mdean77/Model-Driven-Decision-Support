/*******************************************************************************
 * Copyright (c) 2013 OPCoach.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     OPCoach - initial API and implementation
 *******************************************************************************/
package com.opcoach.e4.contextExplorer.parts;

import java.util.Collection;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.internal.contexts.EclipseContext;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.jface.viewers.IColorProvider;
import org.eclipse.jface.viewers.ITreeContentProvider;
import org.eclipse.jface.viewers.LabelProvider;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.SWT;
import org.eclipse.swt.graphics.Color;
import org.eclipse.swt.widgets.Display;

import com.opcoach.e4.contextExplorer.search.ContextRegistry;

public class ContextTreeProvider extends LabelProvider implements ITreeContentProvider, IColorProvider
{

	@Inject
	private ContextRegistry contextRegistry;

	@Inject
	public ContextTreeProvider()
	{

	}

	@Override
	public void dispose()
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void inputChanged(Viewer viewer, Object oldInput, Object newInput)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public Object[] getElements(Object inputElement)
	{
		if (inputElement instanceof MApplication)
		{
			return new Object[] { ((MApplication) inputElement).getContext().getParent() };
		} else if (inputElement instanceof Collection<?>)
		{
			return ((Collection<?>) inputElement).toArray();
		}

		return new Object[0];
	}

	@Override
	public Object[] getChildren(Object parentElement)
	{
		if (parentElement instanceof EclipseContext)
		{
			return ((EclipseContext) parentElement).getChildren().toArray();
		}
		return null;
	}

	@Override
	public Object getParent(Object element)
	{
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean hasChildren(Object element)
	{
		return ((element instanceof EclipseContext) && !(((EclipseContext) element).getChildren().isEmpty()));
	}

	@Override
	public String getText(Object element)
	{
		return super.getText(element);
	}

	@Override
	public Color getForeground(Object element)
	{
		// Return a color if a text contained in this node containes the text.
		if (element instanceof IEclipseContext && contextRegistry.containsText((IEclipseContext) element))
		{
			return Display.getCurrent().getSystemColor(SWT.COLOR_BLUE);
		}
		return null;
	}

	@Override
	public Color getBackground(Object element)
	{
		return null;
	}

}
