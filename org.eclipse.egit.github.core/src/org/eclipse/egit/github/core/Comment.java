/*******************************************************************************
 *  Copyright (c) 2011 GitHub Inc.
 *  All rights reserved. This program and the accompanying materials
 *  are made available under the terms of the Eclipse Public License v1.0
 *  which accompanies this distribution, and is available at
 *  http://www.eclipse.org/legal/epl-v10.html
 *
 *  Contributors:
 *    Kevin Sawicki (GitHub Inc.) - initial API and implementation
 *******************************************************************************/
package org.eclipse.egit.github.core;

import java.util.Date;

import org.eclipse.egit.github.core.util.DateUtils;

/**
 * GitHub issue and gist comment class.
 */
public class Comment {

	private Date createdAt;

	private Date updatedAt;

	private String body;

	private int id;

	private String url;

	private User user;

	/**
	 * @return createdAt
	 */
	public Date getCreatedAt() {
		return DateUtils.clone(createdAt);
	}

	/**
	 * @param createdAt
	 * @return this comment
	 */
	public Comment setCreatedAt(Date createdAt) {
		this.createdAt = DateUtils.clone(createdAt);
		return this;
	}

	/**
	 * @return updatedAt
	 */
	public Date getUpdatedAt() {
		return DateUtils.clone(updatedAt);
	}

	/**
	 * @param updatedAt
	 * @return this comment
	 */
	public Comment setUpdatedAt(Date updatedAt) {
		this.updatedAt = DateUtils.clone(updatedAt);
		return this;
	}

	/**
	 * @return body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body
	 * @return this comment
	 */
	public Comment setBody(String body) {
		this.body = body;
		return this;
	}

	/**
	 * @return id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id
	 * @return this comment
	 */
	public Comment setId(int id) {
		this.id = id;
		return this;
	}

	/**
	 * @return url
	 */
	public String getUrl() {
		return url;
	}

	/**
	 * @param url
	 * @return this comment
	 */
	public Comment setUrl(String url) {
		this.url = url;
		return this;
	}

	/**
	 * @return user
	 */
	public User getUser() {
		return user;
	}

	/**
	 * @param user
	 * @return this comment
	 */
	public Comment setUser(User user) {
		this.user = user;
		return this;
	}
}
