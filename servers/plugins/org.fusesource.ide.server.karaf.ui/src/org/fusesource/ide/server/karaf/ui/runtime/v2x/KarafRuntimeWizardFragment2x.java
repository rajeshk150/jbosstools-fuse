/*******************************************************************************
 * Copyright (c) 2013 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *     Red Hat, Inc. - initial API and implementation
 ******************************************************************************/

package org.fusesource.ide.server.karaf.ui.runtime.v2x;

import org.eclipse.swt.widgets.Composite;
import org.eclipse.wst.server.ui.wizard.IWizardHandle;
import org.fusesource.ide.server.karaf.ui.runtime.AbstractKarafRuntimeComposite;
import org.fusesource.ide.server.karaf.ui.runtime.AbstractKarafRuntimeWizardFragment;
import org.fusesource.ide.server.karaf.ui.runtime.KarafWizardDataModel;


/**
 * @author lhein
 */
public class KarafRuntimeWizardFragment2x extends
		AbstractKarafRuntimeWizardFragment {

	/* (non-Javadoc)
	 * @see org.fusesource.ide.server.karaf.ui.runtime.AbstractKarafRuntimeWizardFragment#getRuntimeComposite(org.eclipse.swt.widgets.Composite, org.eclipse.wst.server.ui.wizard.IWizardHandle, org.fusesource.ide.server.karaf.ui.runtime.KarafWizardDataModel)
	 */
	@Override
	protected AbstractKarafRuntimeComposite getRuntimeComposite(
			Composite parent, IWizardHandle handle, KarafWizardDataModel model) {
		return new KarafRuntimeComposite2x(parent, handle, model);
	}
}
