/*******************************************************************************
 * Copyright (c) 2015 Red Hat, Inc.
 * Distributed under license by Red Hat, Inc. All rights reserved.
 * This program is made available under the terms of the
 * Eclipse Public License v1.0 which accompanies this distribution,
 * and is available at http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *       Red Hat, Inc. - initial API and implementation
 *******************************************************************************/
package org.jboss.tools.jst.js.bower.internal.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.jboss.tools.jst.js.bower.internal.util.BowerUtil;

/**
 * @author "Ilya Buziuk (ibuziuk)"
 */
public class BowerPreferenceInitializer extends AbstractPreferenceInitializer {

	@Override
	public void initializeDefaultPreferences() {
		String npmLocation = BowerUtil.getNpmLocationFromPath();
		BowerPreferenceHolder.setNpmLocation((npmLocation != null) ? npmLocation : ""); //$NON-NLS-1$
	}

}
