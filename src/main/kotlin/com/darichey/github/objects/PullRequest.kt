package com.darichey.github.objects

data class PullRequest(val id: Int,
					   val url: String,
					   val html_url: String,
					   val diff_url: String,
					   val patch_url: String,
					   val issue_url: String,
					   val commits_url: String,
					   val review_comments_url: String,
					   val review_comment_url: String,
					   val comments_url: String,
					   val statuses_url: String,
					   val number: Int,
					   val state: String,
					   val title: String,
					   val body: String,
					   val assignee: Sender,
					   val milestone: Milestone,
					   val locked: Boolean,
					   val created_at: String,
					   val updated_at: String,
					   val closed_at: String,
					   val merged_at: String,
					   val head: Branch,
					   val base: Branch,
					   val _links: Links,
					   val user: Sender,
					   val merge_commit_sha: String,
					   val merged: Boolean,
					   val mergeable: Boolean,
					   val merged_by: Sender,
					   val comments: Int,
					   val commits: Int,
					   val additions: Int,
					   val deletions: Int,
					   val changed_files: Int,
					   val maintainer_can_modify: Boolean)