/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
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

package com.liferay.headless.foundation.internal.jaxrs.exception.mapper;

import com.liferay.asset.kernel.exception.DuplicateVocabularyException;
import com.liferay.portal.kernel.util.StringUtil;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.osgi.service.component.annotations.Component;

/**
 * Converts any {@code DuplicateVocabularyException} to a {@code 409} error.
 *
 * @author Víctor Galán
 * @review
 */
@Component(
	property = {
		"osgi.jaxrs.application.select=(osgi.jaxrs.name=Liferay.Headless.Foundation)",
		"osgi.jaxrs.extension=true",
		"osgi.jaxrs.name=Liferay.Headless.Foundation.DuplicateTaxonomyVocabularyExceptionMapper"
	},
	service = ExceptionMapper.class
)
public class DuplicateTaxonomyVocabularyExceptionMapper
	implements ExceptionMapper<DuplicateVocabularyException> {

	@Override
	public Response toResponse(DuplicateVocabularyException dve) {
		return Response.status(
			409
		).type(
			MediaType.TEXT_PLAIN
		).entity(
			StringUtil.replace(
				dve.getMessage(), "category vocabulary", "taxonomy vocabulary")
		).build();
	}

}