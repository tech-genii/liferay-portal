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

package com.liferay.headless.delivery.internal.jaxrs.exception.mapper;

import com.liferay.knowledge.base.exception.DuplicateKBFolderNameException;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.ext.ExceptionMapper;

import org.osgi.service.component.annotations.Component;

/**
 * Converts any {@code DuplicateKBFolderNameException} to a {@code 422}
 * error.
 *
 * @author Alejandro Hernández
 * @review
 */
@Component(
	property = {
		"osgi.jaxrs.application.select=(osgi.jaxrs.name=Liferay.Headless.Delivery)",
		"osgi.jaxrs.extension=true",
		"osgi.jaxrs.name=Liferay.Headless.Delivery.DuplicateKnowledgeBaseFolderNameExceptionMapper"
	},
	service = ExceptionMapper.class
)
public class DuplicateKnowledgeBaseFolderNameExceptionMapper
	implements ExceptionMapper<DuplicateKBFolderNameException> {

	@Override
	public Response toResponse(DuplicateKBFolderNameException dkbfne) {
		return Response.status(
			409
		).type(
			MediaType.TEXT_PLAIN
		).entity(
			dkbfne.getMessage()
		).build();
	}

}