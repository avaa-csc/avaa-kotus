/**
 * Copyright (c) 2000-2013 Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package fi.csc.avaa.kotus.kielikartastot.db;

import com.liferay.portal.NoSuchModelException;

/**
 * @author CSC
 */
public class NoSuchAineistoException extends NoSuchModelException {

	public NoSuchAineistoException() {
		super();
	}

	public NoSuchAineistoException(String msg) {
		super(msg);
	}

	public NoSuchAineistoException(String msg, Throwable cause) {
		super(msg, cause);
	}

	public NoSuchAineistoException(Throwable cause) {
		super(cause);
	}

}