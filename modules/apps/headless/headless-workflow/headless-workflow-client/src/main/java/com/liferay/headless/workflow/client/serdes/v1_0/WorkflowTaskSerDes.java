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

package com.liferay.headless.workflow.client.serdes.v1_0;

import com.liferay.headless.workflow.client.dto.v1_0.WorkflowTask;
import com.liferay.headless.workflow.client.json.BaseJSONParser;

import java.util.Collection;
import java.util.Date;
import java.util.Objects;

import javax.annotation.Generated;

/**
 * @author Javier Gamarra
 * @generated
 */
@Generated("")
public class WorkflowTaskSerDes {

	public static WorkflowTask toDTO(String json) {
		WorkflowTaskJSONParser workflowTaskJSONParser =
			new WorkflowTaskJSONParser();

		return workflowTaskJSONParser.parseToDTO(json);
	}

	public static WorkflowTask[] toDTOs(String json) {
		WorkflowTaskJSONParser workflowTaskJSONParser =
			new WorkflowTaskJSONParser();

		return workflowTaskJSONParser.parseToDTOs(json);
	}

	public static String toJSON(WorkflowTask workflowTask) {
		if (workflowTask == null) {
			return "{}";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("{");

		sb.append("\"completed\": ");

		sb.append(workflowTask.getCompleted());
		sb.append(", ");

		sb.append("\"dateCompleted\": ");

		sb.append("\"");
		sb.append(workflowTask.getDateCompleted());
		sb.append("\"");
		sb.append(", ");

		sb.append("\"dateCreated\": ");

		sb.append("\"");
		sb.append(workflowTask.getDateCreated());
		sb.append("\"");
		sb.append(", ");

		sb.append("\"definitionName\": ");

		sb.append("\"");
		sb.append(workflowTask.getDefinitionName());
		sb.append("\"");
		sb.append(", ");

		sb.append("\"description\": ");

		sb.append("\"");
		sb.append(workflowTask.getDescription());
		sb.append("\"");
		sb.append(", ");

		sb.append("\"dueDate\": ");

		sb.append("\"");
		sb.append(workflowTask.getDueDate());
		sb.append("\"");
		sb.append(", ");

		sb.append("\"id\": ");

		sb.append(workflowTask.getId());
		sb.append(", ");

		sb.append("\"name\": ");

		sb.append("\"");
		sb.append(workflowTask.getName());
		sb.append("\"");
		sb.append(", ");

		sb.append("\"objectReviewed\": ");

		sb.append(workflowTask.getObjectReviewed());
		sb.append(", ");

		sb.append("\"transitions\": ");

		if (workflowTask.getTransitions() == null) {
			sb.append("null");
		}
		else {
			sb.append("[");

			for (int i = 0; i < workflowTask.getTransitions().length; i++) {
				sb.append("\"");
				sb.append(workflowTask.getTransitions()[i]);
				sb.append("\"");

				if ((i + 1) < workflowTask.getTransitions().length) {
					sb.append(", ");
				}
			}

			sb.append("]");
		}

		sb.append("}");

		return sb.toString();
	}

	public static String toJSON(Collection<WorkflowTask> workflowTasks) {
		if (workflowTasks == null) {
			return "[]";
		}

		StringBuilder sb = new StringBuilder();

		sb.append("[");

		for (WorkflowTask workflowTask : workflowTasks) {
			if (sb.length() > 1) {
				sb.append(", ");
			}

			sb.append(toJSON(workflowTask));
		}

		sb.append("]");

		return sb.toString();
	}

	private static class WorkflowTaskJSONParser
		extends BaseJSONParser<WorkflowTask> {

		protected WorkflowTask createDTO() {
			return new WorkflowTask();
		}

		protected WorkflowTask[] createDTOArray(int size) {
			return new WorkflowTask[size];
		}

		protected void setField(
			WorkflowTask workflowTask, String jsonParserFieldName,
			Object jsonParserFieldValue) {

			if (Objects.equals(jsonParserFieldName, "completed")) {
				if (jsonParserFieldValue != null) {
					workflowTask.setCompleted((Boolean)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dateCompleted")) {
				if (jsonParserFieldValue != null) {
					workflowTask.setDateCompleted((Date)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dateCreated")) {
				if (jsonParserFieldValue != null) {
					workflowTask.setDateCreated((Date)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "definitionName")) {
				if (jsonParserFieldValue != null) {
					workflowTask.setDefinitionName(
						(String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "description")) {
				if (jsonParserFieldValue != null) {
					workflowTask.setDescription((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "dueDate")) {
				if (jsonParserFieldValue != null) {
					workflowTask.setDueDate((Date)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "id")) {
				if (jsonParserFieldValue != null) {
					workflowTask.setId((Long)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "name")) {
				if (jsonParserFieldValue != null) {
					workflowTask.setName((String)jsonParserFieldValue);
				}
			}
			else if (Objects.equals(jsonParserFieldName, "objectReviewed")) {
				if (jsonParserFieldValue != null) {
					workflowTask.setObjectReviewed(
						ObjectReviewedSerDes.toDTO(
							(String)jsonParserFieldValue));
				}
			}
			else if (Objects.equals(jsonParserFieldName, "transitions")) {
				if (jsonParserFieldValue != null) {
					workflowTask.setTransitions(
						toStrings((Object[])jsonParserFieldValue));
				}
			}
			else {
				throw new IllegalArgumentException(
					"Unsupported field name " + jsonParserFieldName);
			}
		}

	}

}