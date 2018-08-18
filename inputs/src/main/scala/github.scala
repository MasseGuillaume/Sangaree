import sangaree._
package object github {
  type Closer = Commit | PullRequest
  type CollectionItemContent = Organization | Repository | User
  type Date = AnyVal
  type DateTime = AnyVal
  type GitObjectID = AnyVal
  type GitSSHRemote = AnyVal
  type GitTimestamp = AnyVal
  type HTML = AnyVal
  type IssueOrPullRequest = Issue | PullRequest
  type IssueTimelineItem = AssignedEvent | ClosedEvent | Commit | CrossReferencedEvent | DemilestonedEvent | IssueComment | LabeledEvent | LockedEvent | MilestonedEvent | ReferencedEvent | RenamedTitleEvent | ReopenedEvent | SubscribedEvent | UnassignedEvent | UnlabeledEvent | UnlockedEvent | UnsubscribedEvent
  type MilestoneItem = Issue | PullRequest
  type ProjectCardItem = Issue | PullRequest
  type PullRequestTimelineItem = AssignedEvent | BaseRefForcePushedEvent | ClosedEvent | Commit | CommitCommentThread | CrossReferencedEvent | DemilestonedEvent | DeployedEvent | DeploymentEnvironmentChangedEvent | HeadRefDeletedEvent | HeadRefForcePushedEvent | HeadRefRestoredEvent | IssueComment | LabeledEvent | LockedEvent | MergedEvent | MilestonedEvent | PullRequestReview | PullRequestReviewComment | PullRequestReviewThread | ReferencedEvent | RenamedTitleEvent | ReopenedEvent | ReviewDismissedEvent | ReviewRequestRemovedEvent | ReviewRequestedEvent | SubscribedEvent | UnassignedEvent | UnlabeledEvent | UnlockedEvent | UnsubscribedEvent
  type PushAllowanceActor = Team | User
  type ReferencedSubject = Issue | PullRequest
  type RenamedTitleSubject = Issue | PullRequest
  type RequestedReviewer = Team | User
  type ReviewDismissalAllowanceActor = Team | User
  type SearchResultItem = Issue | MarketplaceListing | Organization | PullRequest | Repository | User
  type URI = AnyVal
  type X509Certificate = AnyVal
}
package github {
  case class AcceptTopicSuggestionInput()
  case class AcceptTopicSuggestionPayload(clientMutationId: Option[String], topic: Option[Topic])
  case class Actor(avatarUrl: Option[URI], login: Option[String], resourcePath: Option[URI], url: Option[URI])
  case class AddCommentInput()
  case class AddCommentPayload(clientMutationId: Option[String], commentEdge: Option[IssueCommentEdge], subject: Option[Node], timelineEdge: Option[IssueTimelineItemEdge])
  case class AddProjectCardInput()
  case class AddProjectCardPayload(cardEdge: Option[ProjectCardEdge], clientMutationId: Option[String], projectColumn: Option[Project])
  case class AddProjectColumnInput()
  case class AddProjectColumnPayload(clientMutationId: Option[String], columnEdge: Option[ProjectColumnEdge], project: Option[Project])
  case class AddPullRequestReviewCommentInput()
  case class AddPullRequestReviewCommentPayload(clientMutationId: Option[String], comment: Option[PullRequestReviewComment], commentEdge: Option[PullRequestReviewCommentEdge])
  case class AddPullRequestReviewInput()
  case class AddPullRequestReviewPayload(clientMutationId: Option[String], pullRequestReview: Option[PullRequestReview], reviewEdge: Option[PullRequestReviewEdge])
  case class AddReactionInput()
  case class AddReactionPayload(clientMutationId: Option[String], reaction: Option[Reaction], subject: Option[Reactable])
  case class AddStarInput()
  case class AddStarPayload(clientMutationId: Option[String], starrable: Option[Starrable])
  case class AddedToProjectEvent(actor: Option[Actor], createdAt: Option[DateTime], databaseId: Option[Int], id: Option[ID])
  case class App(createdAt: Option[DateTime], databaseId: Option[Int], description: Option[String], id: Option[ID], logoUrl: Option[URI], name: Option[String], slug: Option[String], updatedAt: Option[DateTime], url: Option[URI])
  case class AppEdge(cursor: Option[String], node: Option[App])
  case class Assignable(assignees: Option[UserConnection])
  case class AssignedEvent(actor: Option[Actor], assignable: Option[Assignable], createdAt: Option[DateTime], id: Option[ID], user: Option[User])
  case class BaseRefChangedEvent(actor: Option[Actor], createdAt: Option[DateTime], databaseId: Option[Int], id: Option[ID])
  case class BaseRefForcePushedEvent(actor: Option[Actor], afterCommit: Option[Commit], beforeCommit: Option[Commit], createdAt: Option[DateTime], id: Option[ID], pullRequest: Option[PullRequest], ref: Option[Ref])
  case class Blame(ranges: List[Option[BlameRange]])
  case class BlameRange(age: Option[Int], commit: Option[Commit], endingLine: Option[Int], startingLine: Option[Int])
  case class Blob(abbreviatedOid: Option[String], byteSize: Option[Int], commitResourcePath: Option[URI], commitUrl: Option[URI], id: Option[ID], isBinary: Option[Boolean], isTruncated: Option[Boolean], oid: Option[GitObjectID], repository: Option[Repository], text: Option[String])
  case class Bot(avatarUrl: Option[URI], createdAt: Option[DateTime], databaseId: Option[Int], id: Option[ID], login: Option[String], resourcePath: Option[URI], updatedAt: Option[DateTime], url: Option[URI])
  case class Closable(closed: Option[Boolean], closedAt: Option[DateTime])
  case class ClosedEvent(actor: Option[Actor], closable: Option[Closable], closer: Option[Closer], createdAt: Option[DateTime], id: Option[ID], resourcePath: Option[URI], url: Option[URI])
  case class CodeOfConduct(body: Option[String], key: Option[String], name: Option[String], url: Option[URI])
  sealed trait CollaboratorAffiliation
  object CollaboratorAffiliation {
    case object ALL extends CollaboratorAffiliation
    case object DIRECT extends CollaboratorAffiliation
    case object OUTSIDE extends CollaboratorAffiliation
  }
  case class Comment(author: Option[Actor], authorAssociation: Option[CommentAuthorAssociation], body: Option[String], bodyHTML: Option[HTML], bodyText: Option[String], createdAt: Option[DateTime], createdViaEmail: Option[Boolean], editor: Option[Actor], id: Option[ID], includesCreatedEdit: Option[Boolean], lastEditedAt: Option[DateTime], publishedAt: Option[DateTime], updatedAt: Option[DateTime], userContentEdits: Option[UserContentEditConnection], viewerDidAuthor: Option[Boolean])
  sealed trait CommentAuthorAssociation
  object CommentAuthorAssociation {
    case object COLLABORATOR extends CommentAuthorAssociation
    case object CONTRIBUTOR extends CommentAuthorAssociation
    case object FIRST_TIMER extends CommentAuthorAssociation
    case object FIRST_TIME_CONTRIBUTOR extends CommentAuthorAssociation
    case object MEMBER extends CommentAuthorAssociation
    case object NONE extends CommentAuthorAssociation
    case object OWNER extends CommentAuthorAssociation
  }
  sealed trait CommentCannotUpdateReason
  object CommentCannotUpdateReason {
    case object INSUFFICIENT_ACCESS extends CommentCannotUpdateReason
    case object LOCKED extends CommentCannotUpdateReason
    case object LOGIN_REQUIRED extends CommentCannotUpdateReason
    case object MAINTENANCE extends CommentCannotUpdateReason
    case object VERIFIED_EMAIL_REQUIRED extends CommentCannotUpdateReason
  }
  case class CommentDeletedEvent(actor: Option[Actor], createdAt: Option[DateTime], databaseId: Option[Int], id: Option[ID])
  case class Commit(abbreviatedOid: Option[String], additions: Option[Int], author: Option[GitActor], authoredByCommitter: Option[Boolean], authoredDate: Option[DateTime], blame: Option[Blame], changedFiles: Option[Int], comments: Option[CommitCommentConnection], commitResourcePath: Option[URI], commitUrl: Option[URI], committedDate: Option[DateTime], committedViaWeb: Option[Boolean], committer: Option[GitActor], deletions: Option[Int], history: Option[CommitHistoryConnection], id: Option[ID], message: Option[String], messageBody: Option[String], messageBodyHTML: Option[HTML], messageHeadline: Option[String], messageHeadlineHTML: Option[HTML], oid: Option[GitObjectID], parents: Option[CommitConnection], pushedDate: Option[DateTime], repository: Option[Repository], resourcePath: Option[URI], signature: Option[GitSignature], status: Option[Status], tarballUrl: Option[URI], tree: Option[Tree], treeResourcePath: Option[URI], treeUrl: Option[URI], url: Option[URI], viewerCanSubscribe: Option[Boolean], viewerSubscription: Option[SubscriptionState], zipballUrl: Option[URI])
  case class CommitAuthor()
  case class CommitComment(author: Option[Actor], authorAssociation: Option[CommentAuthorAssociation], body: Option[String], bodyHTML: Option[HTML], bodyText: Option[String], commit: Option[Commit], createdAt: Option[DateTime], createdViaEmail: Option[Boolean], databaseId: Option[Int], editor: Option[Actor], id: Option[ID], includesCreatedEdit: Option[Boolean], lastEditedAt: Option[DateTime], path: Option[String], position: Option[Int], publishedAt: Option[DateTime], reactionGroups: List[Option[ReactionGroup]], reactions: Option[ReactionConnection], repository: Option[Repository], resourcePath: Option[URI], updatedAt: Option[DateTime], url: Option[URI], userContentEdits: Option[UserContentEditConnection], viewerCanDelete: Option[Boolean], viewerCanReact: Option[Boolean], viewerCanUpdate: Option[Boolean], viewerCannotUpdateReasons: List[Option[CommentCannotUpdateReason]], viewerDidAuthor: Option[Boolean])
  case class CommitCommentConnection(edges: List[Option[CommitCommentEdge]], nodes: List[Option[CommitComment]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class CommitCommentEdge(cursor: Option[String], node: Option[CommitComment])
  case class CommitCommentThread(comments: Option[CommitCommentConnection], commit: Option[Commit], id: Option[ID], path: Option[String], position: Option[Int], repository: Option[Repository])
  case class CommitConnection(edges: List[Option[CommitEdge]], nodes: List[Option[Commit]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class CommitEdge(cursor: Option[String], node: Option[Commit])
  case class CommitHistoryConnection(edges: List[Option[CommitEdge]], nodes: List[Option[Commit]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class ConvertedNoteToIssueEvent(actor: Option[Actor], createdAt: Option[DateTime], databaseId: Option[Int], id: Option[ID])
  case class CreateProjectInput()
  case class CreateProjectPayload(clientMutationId: Option[String], project: Option[Project])
  case class CrossReferencedEvent(actor: Option[Actor], createdAt: Option[DateTime], id: Option[ID], isCrossRepository: Option[Boolean], referencedAt: Option[DateTime], resourcePath: Option[URI], source: Option[ReferencedSubject], target: Option[ReferencedSubject], url: Option[URI], willCloseTarget: Option[Boolean])
  case class DeclineTopicSuggestionInput()
  case class DeclineTopicSuggestionPayload(clientMutationId: Option[String], topic: Option[Topic])
  sealed trait DefaultRepositoryPermissionField
  object DefaultRepositoryPermissionField {
    case object ADMIN extends DefaultRepositoryPermissionField
    case object NONE extends DefaultRepositoryPermissionField
    case object READ extends DefaultRepositoryPermissionField
    case object WRITE extends DefaultRepositoryPermissionField
  }
  case class Deletable(viewerCanDelete: Option[Boolean])
  case class DeleteProjectCardInput()
  case class DeleteProjectCardPayload(clientMutationId: Option[String], column: Option[ProjectColumn], deletedCardId: Option[ID])
  case class DeleteProjectColumnInput()
  case class DeleteProjectColumnPayload(clientMutationId: Option[String], deletedColumnId: Option[ID], project: Option[Project])
  case class DeleteProjectInput()
  case class DeleteProjectPayload(clientMutationId: Option[String], owner: Option[ProjectOwner])
  case class DeletePullRequestReviewInput()
  case class DeletePullRequestReviewPayload(clientMutationId: Option[String], pullRequestReview: Option[PullRequestReview])
  case class DemilestonedEvent(actor: Option[Actor], createdAt: Option[DateTime], id: Option[ID], milestoneTitle: Option[String], subject: Option[MilestoneItem])
  case class DeployKey(createdAt: Option[DateTime], id: Option[ID], key: Option[String], readOnly: Option[Boolean], title: Option[String], verified: Option[Boolean])
  case class DeployKeyConnection(edges: List[Option[DeployKeyEdge]], nodes: List[Option[DeployKey]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class DeployKeyEdge(cursor: Option[String], node: Option[DeployKey])
  case class DeployedEvent(actor: Option[Actor], createdAt: Option[DateTime], databaseId: Option[Int], deployment: Option[Deployment], id: Option[ID], pullRequest: Option[PullRequest], ref: Option[Ref])
  case class Deployment(commit: Option[Commit], createdAt: Option[DateTime], creator: Option[Actor], databaseId: Option[Int], description: Option[String], environment: Option[String], id: Option[ID], latestStatus: Option[DeploymentStatus], payload: Option[String], repository: Option[Repository], state: Option[DeploymentState], statuses: Option[DeploymentStatusConnection], task: Option[String], updatedAt: Option[DateTime])
  case class DeploymentConnection(edges: List[Option[DeploymentEdge]], nodes: List[Option[Deployment]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class DeploymentEdge(cursor: Option[String], node: Option[Deployment])
  case class DeploymentEnvironmentChangedEvent(actor: Option[Actor], createdAt: Option[DateTime], deploymentStatus: Option[DeploymentStatus], id: Option[ID], pullRequest: Option[PullRequest])
  sealed trait DeploymentState
  object DeploymentState {
    case object ABANDONED extends DeploymentState
    case object ACTIVE extends DeploymentState
    case object DESTROYED extends DeploymentState
    case object ERROR extends DeploymentState
    case object FAILURE extends DeploymentState
    case object INACTIVE extends DeploymentState
    case object PENDING extends DeploymentState
  }
  case class DeploymentStatus(createdAt: Option[DateTime], creator: Option[Actor], deployment: Option[Deployment], description: Option[String], environmentUrl: Option[URI], id: Option[ID], logUrl: Option[URI], state: Option[DeploymentStatusState], updatedAt: Option[DateTime])
  case class DeploymentStatusConnection(edges: List[Option[DeploymentStatusEdge]], nodes: List[Option[DeploymentStatus]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class DeploymentStatusEdge(cursor: Option[String], node: Option[DeploymentStatus])
  sealed trait DeploymentStatusState
  object DeploymentStatusState {
    case object ERROR extends DeploymentStatusState
    case object FAILURE extends DeploymentStatusState
    case object INACTIVE extends DeploymentStatusState
    case object PENDING extends DeploymentStatusState
    case object SUCCESS extends DeploymentStatusState
  }
  case class DismissPullRequestReviewInput()
  case class DismissPullRequestReviewPayload(clientMutationId: Option[String], pullRequestReview: Option[PullRequestReview])
  case class DraftPullRequestReviewComment()
  case class ExternalIdentity(guid: Option[String], id: Option[ID], organizationInvitation: Option[OrganizationInvitation], samlIdentity: Option[ExternalIdentitySamlAttributes], scimIdentity: Option[ExternalIdentityScimAttributes], user: Option[User])
  case class ExternalIdentityConnection(edges: List[Option[ExternalIdentityEdge]], nodes: List[Option[ExternalIdentity]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class ExternalIdentityEdge(cursor: Option[String], node: Option[ExternalIdentity])
  case class ExternalIdentitySamlAttributes(nameId: Option[String])
  case class ExternalIdentityScimAttributes(username: Option[String])
  case class FollowerConnection(edges: List[Option[UserEdge]], nodes: List[Option[User]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class FollowingConnection(edges: List[Option[UserEdge]], nodes: List[Option[User]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class Gist(comments: Option[GistCommentConnection], createdAt: Option[DateTime], description: Option[String], id: Option[ID], isPublic: Option[Boolean], name: Option[String], owner: Option[RepositoryOwner], pushedAt: Option[DateTime], stargazers: Option[StargazerConnection], updatedAt: Option[DateTime], viewerHasStarred: Option[Boolean])
  case class GistComment(author: Option[Actor], authorAssociation: Option[CommentAuthorAssociation], body: Option[String], bodyHTML: Option[HTML], bodyText: Option[String], createdAt: Option[DateTime], createdViaEmail: Option[Boolean], databaseId: Option[Int], editor: Option[Actor], gist: Option[Gist], id: Option[ID], includesCreatedEdit: Option[Boolean], lastEditedAt: Option[DateTime], publishedAt: Option[DateTime], updatedAt: Option[DateTime], userContentEdits: Option[UserContentEditConnection], viewerCanDelete: Option[Boolean], viewerCanUpdate: Option[Boolean], viewerCannotUpdateReasons: List[Option[CommentCannotUpdateReason]], viewerDidAuthor: Option[Boolean])
  case class GistCommentConnection(edges: List[Option[GistCommentEdge]], nodes: List[Option[GistComment]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class GistCommentEdge(cursor: Option[String], node: Option[GistComment])
  case class GistConnection(edges: List[Option[GistEdge]], nodes: List[Option[Gist]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class GistEdge(cursor: Option[String], node: Option[Gist])
  case class GistOrder()
  sealed trait GistOrderField
  object GistOrderField {
    case object CREATED_AT extends GistOrderField
    case object PUSHED_AT extends GistOrderField
    case object UPDATED_AT extends GistOrderField
  }
  sealed trait GistPrivacy
  object GistPrivacy {
    case object ALL extends GistPrivacy
    case object PUBLIC extends GistPrivacy
    case object SECRET extends GistPrivacy
  }
  case class GitActor(avatarUrl: Option[URI], date: Option[GitTimestamp], email: Option[String], name: Option[String], user: Option[User])
  case class GitHubMetadata(gitHubServicesSha: Option[GitObjectID], gitIpAddresses: List[Option[String]], hookIpAddresses: List[Option[String]], importerIpAddresses: List[Option[String]], isPasswordAuthenticationVerifiable: Option[Boolean], pagesIpAddresses: List[Option[String]])
  case class GitObject(abbreviatedOid: Option[String], commitResourcePath: Option[URI], commitUrl: Option[URI], id: Option[ID], oid: Option[GitObjectID], repository: Option[Repository])
  case class GitSignature(email: Option[String], isValid: Option[Boolean], payload: Option[String], signature: Option[String], signer: Option[User], state: Option[GitSignatureState], wasSignedByGitHub: Option[Boolean])
  sealed trait GitSignatureState
  object GitSignatureState {
    case object BAD_EMAIL extends GitSignatureState
    case object EXPIRED_KEY extends GitSignatureState
    case object GPGVERIFY_ERROR extends GitSignatureState
    case object GPGVERIFY_UNAVAILABLE extends GitSignatureState
    case object INVALID extends GitSignatureState
    case object MALFORMED_SIG extends GitSignatureState
    case object NOT_SIGNING_KEY extends GitSignatureState
    case object NO_USER extends GitSignatureState
    case object OCSP_ERROR extends GitSignatureState
    case object OCSP_PENDING extends GitSignatureState
    case object OCSP_REVOKED extends GitSignatureState
    case object UNKNOWN_KEY extends GitSignatureState
    case object UNKNOWN_SIG_TYPE extends GitSignatureState
    case object UNSIGNED extends GitSignatureState
    case object UNVERIFIED_EMAIL extends GitSignatureState
    case object VALID extends GitSignatureState
  }
  case class GpgSignature(email: Option[String], isValid: Option[Boolean], keyId: Option[String], payload: Option[String], signature: Option[String], signer: Option[User], state: Option[GitSignatureState], wasSignedByGitHub: Option[Boolean])
  case class HeadRefDeletedEvent(actor: Option[Actor], createdAt: Option[DateTime], headRef: Option[Ref], headRefName: Option[String], id: Option[ID], pullRequest: Option[PullRequest])
  case class HeadRefForcePushedEvent(actor: Option[Actor], afterCommit: Option[Commit], beforeCommit: Option[Commit], createdAt: Option[DateTime], id: Option[ID], pullRequest: Option[PullRequest], ref: Option[Ref])
  case class HeadRefRestoredEvent(actor: Option[Actor], createdAt: Option[DateTime], id: Option[ID], pullRequest: Option[PullRequest])
  case class Issue(activeLockReason: Option[LockReason], assignees: Option[UserConnection], author: Option[Actor], authorAssociation: Option[CommentAuthorAssociation], body: Option[String], bodyHTML: Option[HTML], bodyText: Option[String], closed: Option[Boolean], closedAt: Option[DateTime], comments: Option[IssueCommentConnection], createdAt: Option[DateTime], createdViaEmail: Option[Boolean], databaseId: Option[Int], editor: Option[Actor], id: Option[ID], includesCreatedEdit: Option[Boolean], labels: Option[LabelConnection], lastEditedAt: Option[DateTime], locked: Option[Boolean], milestone: Option[Milestone], number: Option[Int], participants: Option[UserConnection], projectCards: Option[ProjectCardConnection], publishedAt: Option[DateTime], reactionGroups: List[Option[ReactionGroup]], reactions: Option[ReactionConnection], repository: Option[Repository], resourcePath: Option[URI], state: Option[IssueState], timeline: Option[IssueTimelineConnection], title: Option[String], updatedAt: Option[DateTime], url: Option[URI], userContentEdits: Option[UserContentEditConnection], viewerCanReact: Option[Boolean], viewerCanSubscribe: Option[Boolean], viewerCanUpdate: Option[Boolean], viewerCannotUpdateReasons: List[Option[CommentCannotUpdateReason]], viewerDidAuthor: Option[Boolean], viewerSubscription: Option[SubscriptionState])
  case class IssueComment(author: Option[Actor], authorAssociation: Option[CommentAuthorAssociation], body: Option[String], bodyHTML: Option[HTML], bodyText: Option[String], createdAt: Option[DateTime], createdViaEmail: Option[Boolean], databaseId: Option[Int], editor: Option[Actor], id: Option[ID], includesCreatedEdit: Option[Boolean], issue: Option[Issue], lastEditedAt: Option[DateTime], publishedAt: Option[DateTime], pullRequest: Option[PullRequest], reactionGroups: List[Option[ReactionGroup]], reactions: Option[ReactionConnection], repository: Option[Repository], resourcePath: Option[URI], updatedAt: Option[DateTime], url: Option[URI], userContentEdits: Option[UserContentEditConnection], viewerCanDelete: Option[Boolean], viewerCanReact: Option[Boolean], viewerCanUpdate: Option[Boolean], viewerCannotUpdateReasons: List[Option[CommentCannotUpdateReason]], viewerDidAuthor: Option[Boolean])
  case class IssueCommentConnection(edges: List[Option[IssueCommentEdge]], nodes: List[Option[IssueComment]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class IssueCommentEdge(cursor: Option[String], node: Option[IssueComment])
  case class IssueConnection(edges: List[Option[IssueEdge]], nodes: List[Option[Issue]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class IssueEdge(cursor: Option[String], node: Option[Issue])
  case class IssueOrder()
  sealed trait IssueOrderField
  object IssueOrderField {
    case object COMMENTS extends IssueOrderField
    case object CREATED_AT extends IssueOrderField
    case object UPDATED_AT extends IssueOrderField
  }
  sealed trait IssuePubSubTopic
  object IssuePubSubTopic {
    case object MARKASREAD extends IssuePubSubTopic
    case object TIMELINE extends IssuePubSubTopic
    case object UPDATED extends IssuePubSubTopic
  }
  sealed trait IssueState
  object IssueState {
    case object CLOSED extends IssueState
    case object OPEN extends IssueState
  }
  case class IssueTimelineConnection(edges: List[Option[IssueTimelineItemEdge]], nodes: List[Option[IssueTimelineItem]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class IssueTimelineItemEdge(cursor: Option[String], node: Option[IssueTimelineItem])
  case class Label(color: Option[String], createdAt: Option[DateTime], description: Option[String], id: Option[ID], isDefault: Option[Boolean], issues: Option[IssueConnection], name: Option[String], pullRequests: Option[PullRequestConnection], repository: Option[Repository], resourcePath: Option[URI], updatedAt: Option[DateTime], url: Option[URI])
  case class LabelConnection(edges: List[Option[LabelEdge]], nodes: List[Option[Label]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class LabelEdge(cursor: Option[String], node: Option[Label])
  case class Labelable(labels: Option[LabelConnection])
  case class LabeledEvent(actor: Option[Actor], createdAt: Option[DateTime], id: Option[ID], label: Option[Label], labelable: Option[Labelable])
  case class Language(color: Option[String], id: Option[ID], name: Option[String])
  case class LanguageConnection(edges: List[Option[LanguageEdge]], nodes: List[Option[Language]], pageInfo: Option[PageInfo], totalCount: Option[Int], totalSize: Option[Int])
  case class LanguageEdge(cursor: Option[String], node: Option[Language], size: Option[Int])
  case class LanguageOrder()
  sealed trait LanguageOrderField
  object LanguageOrderField { case object SIZE extends LanguageOrderField }
  case class License(body: Option[String], conditions: List[Option[LicenseRule]], description: Option[String], featured: Option[Boolean], hidden: Option[Boolean], id: Option[ID], implementation: Option[String], key: Option[String], limitations: List[Option[LicenseRule]], name: Option[String], nickname: Option[String], permissions: List[Option[LicenseRule]], pseudoLicense: Option[Boolean], spdxId: Option[String], url: Option[URI])
  case class LicenseRule(description: Option[String], key: Option[String], label: Option[String])
  case class LockLockableInput()
  case class LockLockablePayload(clientMutationId: Option[String], lockedRecord: Option[Lockable])
  sealed trait LockReason
  object LockReason {
    case object OFF_TOPIC extends LockReason
    case object RESOLVED extends LockReason
    case object SPAM extends LockReason
    case object TOO_HEATED extends LockReason
  }
  case class Lockable(activeLockReason: Option[LockReason], locked: Option[Boolean])
  case class LockedEvent(actor: Option[Actor], createdAt: Option[DateTime], id: Option[ID], lockReason: Option[LockReason], lockable: Option[Lockable])
  case class MarketplaceCategory(description: Option[String], howItWorks: Option[String], id: Option[ID], name: Option[String], primaryListingCount: Option[Int], resourcePath: Option[URI], secondaryListingCount: Option[Int], slug: Option[String], url: Option[URI])
  case class MarketplaceListing(app: Option[App], companyUrl: Option[URI], configurationResourcePath: Option[URI], configurationUrl: Option[URI], documentationUrl: Option[URI], extendedDescription: Option[String], extendedDescriptionHTML: Option[HTML], fullDescription: Option[String], fullDescriptionHTML: Option[HTML], hasApprovalBeenRequested: Option[Boolean], hasPublishedFreeTrialPlans: Option[Boolean], hasTermsOfService: Option[Boolean], howItWorks: Option[String], howItWorksHTML: Option[HTML], id: Option[ID], installationUrl: Option[URI], installedForViewer: Option[Boolean], isApproved: Option[Boolean], isDelisted: Option[Boolean], isDraft: Option[Boolean], isPaid: Option[Boolean], isRejected: Option[Boolean], logoBackgroundColor: Option[String], logoUrl: Option[URI], name: Option[String], normalizedShortDescription: Option[String], pricingUrl: Option[URI], primaryCategory: Option[MarketplaceCategory], privacyPolicyUrl: Option[URI], resourcePath: Option[URI], screenshotUrls: List[Option[String]], secondaryCategory: Option[MarketplaceCategory], shortDescription: Option[String], slug: Option[String], statusUrl: Option[URI], supportEmail: Option[String], supportUrl: Option[URI], termsOfServiceUrl: Option[URI], url: Option[URI], viewerCanAddPlans: Option[Boolean], viewerCanApprove: Option[Boolean], viewerCanDelist: Option[Boolean], viewerCanEdit: Option[Boolean], viewerCanEditCategories: Option[Boolean], viewerCanEditPlans: Option[Boolean], viewerCanRedraft: Option[Boolean], viewerCanReject: Option[Boolean], viewerCanRequestApproval: Option[Boolean], viewerHasPurchased: Option[Boolean], viewerHasPurchasedForAllOrganizations: Option[Boolean], viewerIsListingAdmin: Option[Boolean])
  case class MarketplaceListingConnection(edges: List[Option[MarketplaceListingEdge]], nodes: List[Option[MarketplaceListing]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class MarketplaceListingEdge(cursor: Option[String], node: Option[MarketplaceListing])
  case class MentionedEvent(actor: Option[Actor], createdAt: Option[DateTime], databaseId: Option[Int], id: Option[ID])
  sealed trait MergeableState
  object MergeableState {
    case object CONFLICTING extends MergeableState
    case object MERGEABLE extends MergeableState
    case object UNKNOWN extends MergeableState
  }
  case class MergedEvent(actor: Option[Actor], commit: Option[Commit], createdAt: Option[DateTime], id: Option[ID], mergeRef: Option[Ref], mergeRefName: Option[String], pullRequest: Option[PullRequest], resourcePath: Option[URI], url: Option[URI])
  case class Milestone(closed: Option[Boolean], closedAt: Option[DateTime], createdAt: Option[DateTime], creator: Option[Actor], description: Option[String], dueOn: Option[DateTime], id: Option[ID], issues: Option[IssueConnection], number: Option[Int], pullRequests: Option[PullRequestConnection], repository: Option[Repository], resourcePath: Option[URI], state: Option[MilestoneState], title: Option[String], updatedAt: Option[DateTime], url: Option[URI])
  case class MilestoneConnection(edges: List[Option[MilestoneEdge]], nodes: List[Option[Milestone]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class MilestoneEdge(cursor: Option[String], node: Option[Milestone])
  case class MilestoneOrder()
  sealed trait MilestoneOrderField
  object MilestoneOrderField {
    case object CREATED_AT extends MilestoneOrderField
    case object DUE_DATE extends MilestoneOrderField
    case object NUMBER extends MilestoneOrderField
    case object UPDATED_AT extends MilestoneOrderField
  }
  sealed trait MilestoneState
  object MilestoneState {
    case object CLOSED extends MilestoneState
    case object OPEN extends MilestoneState
  }
  case class MilestonedEvent(actor: Option[Actor], createdAt: Option[DateTime], id: Option[ID], milestoneTitle: Option[String], subject: Option[MilestoneItem])
  case class MoveProjectCardInput()
  case class MoveProjectCardPayload(cardEdge: Option[ProjectCardEdge], clientMutationId: Option[String])
  case class MoveProjectColumnInput()
  case class MoveProjectColumnPayload(clientMutationId: Option[String], columnEdge: Option[ProjectColumnEdge])
  case class MovedColumnsInProjectEvent(actor: Option[Actor], createdAt: Option[DateTime], databaseId: Option[Int], id: Option[ID])
  case class Mutation(acceptTopicSuggestion: Option[AcceptTopicSuggestionPayload], addComment: Option[AddCommentPayload], addProjectCard: Option[AddProjectCardPayload], addProjectColumn: Option[AddProjectColumnPayload], addPullRequestReview: Option[AddPullRequestReviewPayload], addPullRequestReviewComment: Option[AddPullRequestReviewCommentPayload], addReaction: Option[AddReactionPayload], addStar: Option[AddStarPayload], createProject: Option[CreateProjectPayload], declineTopicSuggestion: Option[DeclineTopicSuggestionPayload], deleteProject: Option[DeleteProjectPayload], deleteProjectCard: Option[DeleteProjectCardPayload], deleteProjectColumn: Option[DeleteProjectColumnPayload], deletePullRequestReview: Option[DeletePullRequestReviewPayload], dismissPullRequestReview: Option[DismissPullRequestReviewPayload], lockLockable: Option[LockLockablePayload], moveProjectCard: Option[MoveProjectCardPayload], moveProjectColumn: Option[MoveProjectColumnPayload], removeOutsideCollaborator: Option[RemoveOutsideCollaboratorPayload], removeReaction: Option[RemoveReactionPayload], removeStar: Option[RemoveStarPayload], requestReviews: Option[RequestReviewsPayload], submitPullRequestReview: Option[SubmitPullRequestReviewPayload], unlockLockable: Option[UnlockLockablePayload], updateProject: Option[UpdateProjectPayload], updateProjectCard: Option[UpdateProjectCardPayload], updateProjectColumn: Option[UpdateProjectColumnPayload], updatePullRequestReview: Option[UpdatePullRequestReviewPayload], updatePullRequestReviewComment: Option[UpdatePullRequestReviewCommentPayload], updateSubscription: Option[UpdateSubscriptionPayload], updateTopics: Option[UpdateTopicsPayload])
  case class Node(id: Option[ID])
  sealed trait OrderDirection
  object OrderDirection {
    case object ASC extends OrderDirection
    case object DESC extends OrderDirection
  }
  case class Organization(avatarUrl: Option[URI], databaseId: Option[Int], description: Option[String], email: Option[String], id: Option[ID], isVerified: Option[Boolean], location: Option[String], login: Option[String], members: Option[UserConnection], name: Option[String], newTeamResourcePath: Option[URI], newTeamUrl: Option[URI], organizationBillingEmail: Option[String], pinnedRepositories: Option[RepositoryConnection], project: Option[Project], projects: Option[ProjectConnection], projectsResourcePath: Option[URI], projectsUrl: Option[URI], repositories: Option[RepositoryConnection], repository: Option[Repository], resourcePath: Option[URI], samlIdentityProvider: Option[OrganizationIdentityProvider], team: Option[Team], teams: Option[TeamConnection], teamsResourcePath: Option[URI], teamsUrl: Option[URI], url: Option[URI], viewerCanAdminister: Option[Boolean], viewerCanCreateProjects: Option[Boolean], viewerCanCreateRepositories: Option[Boolean], viewerCanCreateTeams: Option[Boolean], viewerIsAMember: Option[Boolean], websiteUrl: Option[URI])
  case class OrganizationConnection(edges: List[Option[OrganizationEdge]], nodes: List[Option[Organization]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class OrganizationEdge(cursor: Option[String], node: Option[Organization])
  case class OrganizationIdentityProvider(digestMethod: Option[URI], externalIdentities: Option[ExternalIdentityConnection], id: Option[ID], idpCertificate: Option[X509Certificate], issuer: Option[String], organization: Option[Organization], signatureMethod: Option[URI], ssoUrl: Option[URI])
  case class OrganizationInvitation(createdAt: Option[DateTime], email: Option[String], id: Option[ID], invitationType: Option[OrganizationInvitationType], invitee: Option[User], inviter: Option[User], organization: Option[Organization], role: Option[OrganizationInvitationRole])
  case class OrganizationInvitationConnection(edges: List[Option[OrganizationInvitationEdge]], nodes: List[Option[OrganizationInvitation]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class OrganizationInvitationEdge(cursor: Option[String], node: Option[OrganizationInvitation])
  sealed trait OrganizationInvitationRole
  object OrganizationInvitationRole {
    case object ADMIN extends OrganizationInvitationRole
    case object BILLING_MANAGER extends OrganizationInvitationRole
    case object DIRECT_MEMBER extends OrganizationInvitationRole
    case object REINSTATE extends OrganizationInvitationRole
  }
  sealed trait OrganizationInvitationType
  object OrganizationInvitationType {
    case object EMAIL extends OrganizationInvitationType
    case object USER extends OrganizationInvitationType
  }
  case class PageInfo(endCursor: Option[String], hasNextPage: Option[Boolean], hasPreviousPage: Option[Boolean], startCursor: Option[String])
  case class Project(body: Option[String], bodyHTML: Option[HTML], closed: Option[Boolean], closedAt: Option[DateTime], columns: Option[ProjectColumnConnection], createdAt: Option[DateTime], creator: Option[Actor], databaseId: Option[Int], id: Option[ID], name: Option[String], number: Option[Int], owner: Option[ProjectOwner], pendingCards: Option[ProjectCardConnection], resourcePath: Option[URI], state: Option[ProjectState], updatedAt: Option[DateTime], url: Option[URI], viewerCanUpdate: Option[Boolean])
  case class ProjectCard(column: Option[ProjectColumn], content: Option[ProjectCardItem], createdAt: Option[DateTime], creator: Option[Actor], databaseId: Option[Int], id: Option[ID], note: Option[String], project: Option[Project], resourcePath: Option[URI], state: Option[ProjectCardState], updatedAt: Option[DateTime], url: Option[URI])
  case class ProjectCardConnection(edges: List[Option[ProjectCardEdge]], nodes: List[Option[ProjectCard]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class ProjectCardEdge(cursor: Option[String], node: Option[ProjectCard])
  sealed trait ProjectCardState
  object ProjectCardState {
    case object CONTENT_ONLY extends ProjectCardState
    case object NOTE_ONLY extends ProjectCardState
    case object REDACTED extends ProjectCardState
  }
  case class ProjectColumn(cards: Option[ProjectCardConnection], createdAt: Option[DateTime], databaseId: Option[Int], id: Option[ID], name: Option[String], project: Option[Project], resourcePath: Option[URI], updatedAt: Option[DateTime], url: Option[URI])
  case class ProjectColumnConnection(edges: List[Option[ProjectColumnEdge]], nodes: List[Option[ProjectColumn]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class ProjectColumnEdge(cursor: Option[String], node: Option[ProjectColumn])
  case class ProjectConnection(edges: List[Option[ProjectEdge]], nodes: List[Option[Project]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class ProjectEdge(cursor: Option[String], node: Option[Project])
  case class ProjectOrder()
  sealed trait ProjectOrderField
  object ProjectOrderField {
    case object CREATED_AT extends ProjectOrderField
    case object NAME extends ProjectOrderField
    case object UPDATED_AT extends ProjectOrderField
  }
  case class ProjectOwner(id: Option[ID], project: Option[Project], projects: Option[ProjectConnection], projectsResourcePath: Option[URI], projectsUrl: Option[URI], viewerCanCreateProjects: Option[Boolean])
  sealed trait ProjectState
  object ProjectState {
    case object CLOSED extends ProjectState
    case object OPEN extends ProjectState
  }
  case class ProtectedBranch(creator: Option[Actor], hasDismissableStaleReviews: Option[Boolean], hasRequiredReviews: Option[Boolean], hasRequiredStatusChecks: Option[Boolean], hasRestrictedPushes: Option[Boolean], hasRestrictedReviewDismissals: Option[Boolean], hasStrictRequiredStatusChecks: Option[Boolean], id: Option[ID], isAdminEnforced: Option[Boolean], name: Option[String], pushAllowances: Option[PushAllowanceConnection], repository: Option[Repository], requiredStatusCheckContexts: List[Option[String]], reviewDismissalAllowances: Option[ReviewDismissalAllowanceConnection])
  case class ProtectedBranchConnection(edges: List[Option[ProtectedBranchEdge]], nodes: List[Option[ProtectedBranch]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class ProtectedBranchEdge(cursor: Option[String], node: Option[ProtectedBranch])
  case class PublicKey(id: Option[ID], key: Option[String])
  case class PublicKeyConnection(edges: List[Option[PublicKeyEdge]], nodes: List[Option[PublicKey]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class PublicKeyEdge(cursor: Option[String], node: Option[PublicKey])
  case class PullRequest(activeLockReason: Option[LockReason], additions: Option[Int], assignees: Option[UserConnection], author: Option[Actor], authorAssociation: Option[CommentAuthorAssociation], baseRef: Option[Ref], baseRefName: Option[String], baseRefOid: Option[GitObjectID], body: Option[String], bodyHTML: Option[HTML], bodyText: Option[String], changedFiles: Option[Int], closed: Option[Boolean], closedAt: Option[DateTime], comments: Option[IssueCommentConnection], commits: Option[PullRequestCommitConnection], createdAt: Option[DateTime], createdViaEmail: Option[Boolean], databaseId: Option[Int], deletions: Option[Int], editor: Option[Actor], headRef: Option[Ref], headRefName: Option[String], headRefOid: Option[GitObjectID], headRepository: Option[Repository], headRepositoryOwner: Option[RepositoryOwner], id: Option[ID], includesCreatedEdit: Option[Boolean], isCrossRepository: Option[Boolean], labels: Option[LabelConnection], lastEditedAt: Option[DateTime], locked: Option[Boolean], maintainerCanModify: Option[Boolean], mergeCommit: Option[Commit], mergeable: Option[MergeableState], merged: Option[Boolean], mergedAt: Option[DateTime], mergedBy: Option[Actor], milestone: Option[Milestone], number: Option[Int], participants: Option[UserConnection], permalink: Option[URI], potentialMergeCommit: Option[Commit], projectCards: Option[ProjectCardConnection], publishedAt: Option[DateTime], reactionGroups: List[Option[ReactionGroup]], reactions: Option[ReactionConnection], repository: Option[Repository], resourcePath: Option[URI], revertResourcePath: Option[URI], revertUrl: Option[URI], reviewRequests: Option[ReviewRequestConnection], reviews: Option[PullRequestReviewConnection], state: Option[PullRequestState], suggestedReviewers: List[Option[SuggestedReviewer]], timeline: Option[PullRequestTimelineConnection], title: Option[String], updatedAt: Option[DateTime], url: Option[URI], userContentEdits: Option[UserContentEditConnection], viewerCanReact: Option[Boolean], viewerCanSubscribe: Option[Boolean], viewerCanUpdate: Option[Boolean], viewerCannotUpdateReasons: List[Option[CommentCannotUpdateReason]], viewerDidAuthor: Option[Boolean], viewerSubscription: Option[SubscriptionState])
  case class PullRequestCommit(commit: Option[Commit], id: Option[ID], pullRequest: Option[PullRequest], resourcePath: Option[URI], url: Option[URI])
  case class PullRequestCommitConnection(edges: List[Option[PullRequestCommitEdge]], nodes: List[Option[PullRequestCommit]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class PullRequestCommitEdge(cursor: Option[String], node: Option[PullRequestCommit])
  case class PullRequestConnection(edges: List[Option[PullRequestEdge]], nodes: List[Option[PullRequest]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class PullRequestEdge(cursor: Option[String], node: Option[PullRequest])
  sealed trait PullRequestPubSubTopic
  object PullRequestPubSubTopic {
    case object HEAD_REF extends PullRequestPubSubTopic
    case object MARKASREAD extends PullRequestPubSubTopic
    case object TIMELINE extends PullRequestPubSubTopic
    case object UPDATED extends PullRequestPubSubTopic
  }
  case class PullRequestReview(author: Option[Actor], authorAssociation: Option[CommentAuthorAssociation], body: Option[String], bodyHTML: Option[HTML], bodyText: Option[String], comments: Option[PullRequestReviewCommentConnection], commit: Option[Commit], createdAt: Option[DateTime], createdViaEmail: Option[Boolean], databaseId: Option[Int], editor: Option[Actor], id: Option[ID], includesCreatedEdit: Option[Boolean], lastEditedAt: Option[DateTime], publishedAt: Option[DateTime], pullRequest: Option[PullRequest], repository: Option[Repository], resourcePath: Option[URI], state: Option[PullRequestReviewState], submittedAt: Option[DateTime], updatedAt: Option[DateTime], url: Option[URI], userContentEdits: Option[UserContentEditConnection], viewerCanDelete: Option[Boolean], viewerCanUpdate: Option[Boolean], viewerCannotUpdateReasons: List[Option[CommentCannotUpdateReason]], viewerDidAuthor: Option[Boolean])
  case class PullRequestReviewComment(author: Option[Actor], authorAssociation: Option[CommentAuthorAssociation], body: Option[String], bodyHTML: Option[HTML], bodyText: Option[String], commit: Option[Commit], createdAt: Option[DateTime], createdViaEmail: Option[Boolean], databaseId: Option[Int], diffHunk: Option[String], draftedAt: Option[DateTime], editor: Option[Actor], id: Option[ID], includesCreatedEdit: Option[Boolean], lastEditedAt: Option[DateTime], originalCommit: Option[Commit], originalPosition: Option[Int], path: Option[String], position: Option[Int], publishedAt: Option[DateTime], pullRequest: Option[PullRequest], pullRequestReview: Option[PullRequestReview], reactionGroups: List[Option[ReactionGroup]], reactions: Option[ReactionConnection], replyTo: Option[PullRequestReviewComment], repository: Option[Repository], resourcePath: Option[URI], updatedAt: Option[DateTime], url: Option[URI], userContentEdits: Option[UserContentEditConnection], viewerCanDelete: Option[Boolean], viewerCanReact: Option[Boolean], viewerCanUpdate: Option[Boolean], viewerCannotUpdateReasons: List[Option[CommentCannotUpdateReason]], viewerDidAuthor: Option[Boolean])
  case class PullRequestReviewCommentConnection(edges: List[Option[PullRequestReviewCommentEdge]], nodes: List[Option[PullRequestReviewComment]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class PullRequestReviewCommentEdge(cursor: Option[String], node: Option[PullRequestReviewComment])
  case class PullRequestReviewConnection(edges: List[Option[PullRequestReviewEdge]], nodes: List[Option[PullRequestReview]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class PullRequestReviewEdge(cursor: Option[String], node: Option[PullRequestReview])
  sealed trait PullRequestReviewEvent
  object PullRequestReviewEvent {
    case object APPROVE extends PullRequestReviewEvent
    case object COMMENT extends PullRequestReviewEvent
    case object DISMISS extends PullRequestReviewEvent
    case object REQUEST_CHANGES extends PullRequestReviewEvent
  }
  sealed trait PullRequestReviewState
  object PullRequestReviewState {
    case object APPROVED extends PullRequestReviewState
    case object CHANGES_REQUESTED extends PullRequestReviewState
    case object COMMENTED extends PullRequestReviewState
    case object DISMISSED extends PullRequestReviewState
    case object PENDING extends PullRequestReviewState
  }
  case class PullRequestReviewThread(comments: Option[PullRequestReviewCommentConnection], id: Option[ID], pullRequest: Option[PullRequest], repository: Option[Repository])
  sealed trait PullRequestState
  object PullRequestState {
    case object CLOSED extends PullRequestState
    case object MERGED extends PullRequestState
    case object OPEN extends PullRequestState
  }
  case class PullRequestTimelineConnection(edges: List[Option[PullRequestTimelineItemEdge]], nodes: List[Option[PullRequestTimelineItem]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class PullRequestTimelineItemEdge(cursor: Option[String], node: Option[PullRequestTimelineItem])
  case class PushAllowance(actor: Option[PushAllowanceActor], id: Option[ID], protectedBranch: Option[ProtectedBranch])
  case class PushAllowanceConnection(edges: List[Option[PushAllowanceEdge]], nodes: List[Option[PushAllowance]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class PushAllowanceEdge(cursor: Option[String], node: Option[PushAllowance])
  case class Query(codeOfConduct: Option[CodeOfConduct], codesOfConduct: List[Option[CodeOfConduct]], license: Option[License], licenses: List[Option[License]], marketplaceCategories: List[Option[MarketplaceCategory]], marketplaceCategory: Option[MarketplaceCategory], marketplaceListing: Option[MarketplaceListing], marketplaceListings: Option[MarketplaceListingConnection], meta: Option[GitHubMetadata], node: Option[Node], nodes: List[Option[Node]], organization: Option[Organization], rateLimit: Option[RateLimit], relay: Option[Query], repository: Option[Repository], repositoryOwner: Option[RepositoryOwner], resource: Option[UniformResourceLocatable], search: Option[SearchResultItemConnection], topic: Option[Topic], user: Option[User], viewer: Option[User])
  case class RateLimit(cost: Option[Int], limit: Option[Int], nodeCount: Option[Int], remaining: Option[Int], resetAt: Option[DateTime])
  case class Reactable(databaseId: Option[Int], id: Option[ID], reactionGroups: List[Option[ReactionGroup]], reactions: Option[ReactionConnection], viewerCanReact: Option[Boolean])
  case class ReactingUserConnection(edges: List[Option[ReactingUserEdge]], nodes: List[Option[User]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class ReactingUserEdge(cursor: Option[String], node: Option[User], reactedAt: Option[DateTime])
  case class Reaction(content: Option[ReactionContent], createdAt: Option[DateTime], databaseId: Option[Int], id: Option[ID], reactable: Option[Reactable], user: Option[User])
  case class ReactionConnection(edges: List[Option[ReactionEdge]], nodes: List[Option[Reaction]], pageInfo: Option[PageInfo], totalCount: Option[Int], viewerHasReacted: Option[Boolean])
  sealed trait ReactionContent
  object ReactionContent {
    case object CONFUSED extends ReactionContent
    case object HEART extends ReactionContent
    case object HOORAY extends ReactionContent
    case object LAUGH extends ReactionContent
    case object THUMBS_DOWN extends ReactionContent
    case object THUMBS_UP extends ReactionContent
  }
  case class ReactionEdge(cursor: Option[String], node: Option[Reaction])
  case class ReactionGroup(content: Option[ReactionContent], createdAt: Option[DateTime], subject: Option[Reactable], users: Option[ReactingUserConnection], viewerHasReacted: Option[Boolean])
  case class ReactionOrder()
  sealed trait ReactionOrderField
  object ReactionOrderField { case object CREATED_AT extends ReactionOrderField }
  case class Ref(associatedPullRequests: Option[PullRequestConnection], id: Option[ID], name: Option[String], prefix: Option[String], repository: Option[Repository], target: Option[GitObject])
  case class RefConnection(edges: List[Option[RefEdge]], nodes: List[Option[Ref]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class RefEdge(cursor: Option[String], node: Option[Ref])
  case class RefOrder()
  sealed trait RefOrderField
  object RefOrderField {
    case object ALPHABETICAL extends RefOrderField
    case object TAG_COMMIT_DATE extends RefOrderField
  }
  case class ReferencedEvent(actor: Option[Actor], commit: Option[Commit], commitRepository: Option[Repository], createdAt: Option[DateTime], id: Option[ID], isCrossRepository: Option[Boolean], isDirectReference: Option[Boolean], subject: Option[ReferencedSubject])
  case class RegistryPackageOwner(id: Option[ID])
  case class RegistryPackageSearch(id: Option[ID])
  case class Release(author: Option[User], createdAt: Option[DateTime], description: Option[String], id: Option[ID], isDraft: Option[Boolean], isPrerelease: Option[Boolean], name: Option[String], publishedAt: Option[DateTime], releaseAssets: Option[ReleaseAssetConnection], resourcePath: Option[URI], tag: Option[Ref], updatedAt: Option[DateTime], url: Option[URI])
  case class ReleaseAsset(contentType: Option[String], createdAt: Option[DateTime], downloadCount: Option[Int], downloadUrl: Option[URI], id: Option[ID], name: Option[String], release: Option[Release], size: Option[Int], updatedAt: Option[DateTime], uploadedBy: Option[User], url: Option[URI])
  case class ReleaseAssetConnection(edges: List[Option[ReleaseAssetEdge]], nodes: List[Option[ReleaseAsset]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class ReleaseAssetEdge(cursor: Option[String], node: Option[ReleaseAsset])
  case class ReleaseConnection(edges: List[Option[ReleaseEdge]], nodes: List[Option[Release]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class ReleaseEdge(cursor: Option[String], node: Option[Release])
  case class ReleaseOrder()
  sealed trait ReleaseOrderField
  object ReleaseOrderField {
    case object CREATED_AT extends ReleaseOrderField
    case object NAME extends ReleaseOrderField
  }
  case class RemoveOutsideCollaboratorInput()
  case class RemoveOutsideCollaboratorPayload(clientMutationId: Option[String], removedUser: Option[User])
  case class RemoveReactionInput()
  case class RemoveReactionPayload(clientMutationId: Option[String], reaction: Option[Reaction], subject: Option[Reactable])
  case class RemoveStarInput()
  case class RemoveStarPayload(clientMutationId: Option[String], starrable: Option[Starrable])
  case class RemovedFromProjectEvent(actor: Option[Actor], createdAt: Option[DateTime], databaseId: Option[Int], id: Option[ID])
  case class RenamedTitleEvent(actor: Option[Actor], createdAt: Option[DateTime], currentTitle: Option[String], id: Option[ID], previousTitle: Option[String], subject: Option[RenamedTitleSubject])
  case class ReopenedEvent(actor: Option[Actor], closable: Option[Closable], createdAt: Option[DateTime], id: Option[ID])
  case class Repository(assignableUsers: Option[UserConnection], codeOfConduct: Option[CodeOfConduct], collaborators: Option[RepositoryCollaboratorConnection], commitComments: Option[CommitCommentConnection], createdAt: Option[DateTime], databaseId: Option[Int], defaultBranchRef: Option[Ref], deployKeys: Option[DeployKeyConnection], deployments: Option[DeploymentConnection], description: Option[String], descriptionHTML: Option[HTML], diskUsage: Option[Int], forkCount: Option[Int], forks: Option[RepositoryConnection], hasIssuesEnabled: Option[Boolean], hasWikiEnabled: Option[Boolean], homepageUrl: Option[URI], id: Option[ID], isArchived: Option[Boolean], isFork: Option[Boolean], isLocked: Option[Boolean], isMirror: Option[Boolean], isPrivate: Option[Boolean], issue: Option[Issue], issueOrPullRequest: Option[IssueOrPullRequest], issues: Option[IssueConnection], label: Option[Label], labels: Option[LabelConnection], languages: Option[LanguageConnection], licenseInfo: Option[License], lockReason: Option[RepositoryLockReason], mentionableUsers: Option[UserConnection], mergeCommitAllowed: Option[Boolean], milestone: Option[Milestone], milestones: Option[MilestoneConnection], mirrorUrl: Option[URI], name: Option[String], nameWithOwner: Option[String], `object`: Option[GitObject], owner: Option[RepositoryOwner], parent: Option[Repository], primaryLanguage: Option[Language], project: Option[Project], projects: Option[ProjectConnection], projectsResourcePath: Option[URI], projectsUrl: Option[URI], protectedBranches: Option[ProtectedBranchConnection], pullRequest: Option[PullRequest], pullRequests: Option[PullRequestConnection], pushedAt: Option[DateTime], rebaseMergeAllowed: Option[Boolean], ref: Option[Ref], refs: Option[RefConnection], release: Option[Release], releases: Option[ReleaseConnection], repositoryTopics: Option[RepositoryTopicConnection], resourcePath: Option[URI], shortDescriptionHTML: Option[HTML], squashMergeAllowed: Option[Boolean], sshUrl: Option[GitSSHRemote], stargazers: Option[StargazerConnection], updatedAt: Option[DateTime], url: Option[URI], viewerCanAdminister: Option[Boolean], viewerCanCreateProjects: Option[Boolean], viewerCanSubscribe: Option[Boolean], viewerCanUpdateTopics: Option[Boolean], viewerHasStarred: Option[Boolean], viewerPermission: Option[RepositoryPermission], viewerSubscription: Option[SubscriptionState], watchers: Option[UserConnection])
  sealed trait RepositoryAffiliation
  object RepositoryAffiliation {
    case object COLLABORATOR extends RepositoryAffiliation
    case object ORGANIZATION_MEMBER extends RepositoryAffiliation
    case object OWNER extends RepositoryAffiliation
  }
  sealed trait RepositoryCollaboratorAffiliation
  object RepositoryCollaboratorAffiliation {
    case object ALL extends RepositoryCollaboratorAffiliation
    case object OUTSIDE extends RepositoryCollaboratorAffiliation
  }
  case class RepositoryCollaboratorConnection(edges: List[Option[RepositoryCollaboratorEdge]], nodes: List[Option[User]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class RepositoryCollaboratorEdge(cursor: Option[String], node: Option[User], permission: Option[RepositoryPermission])
  case class RepositoryConnection(edges: List[Option[RepositoryEdge]], nodes: List[Option[Repository]], pageInfo: Option[PageInfo], totalCount: Option[Int], totalDiskUsage: Option[Int])
  sealed trait RepositoryContributionType
  object RepositoryContributionType {
    case object COMMIT extends RepositoryContributionType
    case object ISSUE extends RepositoryContributionType
    case object PULL_REQUEST extends RepositoryContributionType
    case object PULL_REQUEST_REVIEW extends RepositoryContributionType
    case object REPOSITORY extends RepositoryContributionType
  }
  case class RepositoryEdge(cursor: Option[String], node: Option[Repository])
  case class RepositoryInfo(createdAt: Option[DateTime], description: Option[String], descriptionHTML: Option[HTML], forkCount: Option[Int], hasIssuesEnabled: Option[Boolean], hasWikiEnabled: Option[Boolean], homepageUrl: Option[URI], isArchived: Option[Boolean], isFork: Option[Boolean], isLocked: Option[Boolean], isMirror: Option[Boolean], isPrivate: Option[Boolean], licenseInfo: Option[License], lockReason: Option[RepositoryLockReason], mirrorUrl: Option[URI], name: Option[String], nameWithOwner: Option[String], owner: Option[RepositoryOwner], pushedAt: Option[DateTime], resourcePath: Option[URI], shortDescriptionHTML: Option[HTML], updatedAt: Option[DateTime], url: Option[URI])
  case class RepositoryInvitation(id: Option[ID], invitee: Option[User], inviter: Option[User], permission: Option[RepositoryPermission], repository: Option[RepositoryInfo])
  case class RepositoryInvitationEdge(cursor: Option[String], node: Option[RepositoryInvitation])
  sealed trait RepositoryLockReason
  object RepositoryLockReason {
    case object BILLING extends RepositoryLockReason
    case object MIGRATING extends RepositoryLockReason
    case object MOVING extends RepositoryLockReason
    case object RENAME extends RepositoryLockReason
  }
  case class RepositoryNode(repository: Option[Repository])
  case class RepositoryOrder()
  sealed trait RepositoryOrderField
  object RepositoryOrderField {
    case object CREATED_AT extends RepositoryOrderField
    case object NAME extends RepositoryOrderField
    case object PUSHED_AT extends RepositoryOrderField
    case object STARGAZERS extends RepositoryOrderField
    case object UPDATED_AT extends RepositoryOrderField
  }
  case class RepositoryOwner(avatarUrl: Option[URI], id: Option[ID], login: Option[String], pinnedRepositories: Option[RepositoryConnection], repositories: Option[RepositoryConnection], repository: Option[Repository], resourcePath: Option[URI], url: Option[URI])
  sealed trait RepositoryPermission
  object RepositoryPermission {
    case object ADMIN extends RepositoryPermission
    case object READ extends RepositoryPermission
    case object WRITE extends RepositoryPermission
  }
  sealed trait RepositoryPrivacy
  object RepositoryPrivacy {
    case object PRIVATE extends RepositoryPrivacy
    case object PUBLIC extends RepositoryPrivacy
  }
  case class RepositoryTopic(id: Option[ID], resourcePath: Option[URI], topic: Option[Topic], url: Option[URI])
  case class RepositoryTopicConnection(edges: List[Option[RepositoryTopicEdge]], nodes: List[Option[RepositoryTopic]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class RepositoryTopicEdge(cursor: Option[String], node: Option[RepositoryTopic])
  case class RequestReviewsInput()
  case class RequestReviewsPayload(clientMutationId: Option[String], pullRequest: Option[PullRequest], requestedReviewersEdge: Option[UserEdge])
  case class ReviewDismissalAllowance(actor: Option[ReviewDismissalAllowanceActor], id: Option[ID], protectedBranch: Option[ProtectedBranch])
  case class ReviewDismissalAllowanceConnection(edges: List[Option[ReviewDismissalAllowanceEdge]], nodes: List[Option[ReviewDismissalAllowance]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class ReviewDismissalAllowanceEdge(cursor: Option[String], node: Option[ReviewDismissalAllowance])
  case class ReviewDismissedEvent(actor: Option[Actor], createdAt: Option[DateTime], databaseId: Option[Int], id: Option[ID], message: Option[String], messageHtml: Option[HTML], previousReviewState: Option[PullRequestReviewState], pullRequest: Option[PullRequest], pullRequestCommit: Option[PullRequestCommit], resourcePath: Option[URI], review: Option[PullRequestReview], url: Option[URI])
  case class ReviewRequest(databaseId: Option[Int], id: Option[ID], pullRequest: Option[PullRequest], requestedReviewer: Option[RequestedReviewer])
  case class ReviewRequestConnection(edges: List[Option[ReviewRequestEdge]], nodes: List[Option[ReviewRequest]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class ReviewRequestEdge(cursor: Option[String], node: Option[ReviewRequest])
  case class ReviewRequestRemovedEvent(actor: Option[Actor], createdAt: Option[DateTime], id: Option[ID], pullRequest: Option[PullRequest], requestedReviewer: Option[RequestedReviewer])
  case class ReviewRequestedEvent(actor: Option[Actor], createdAt: Option[DateTime], id: Option[ID], pullRequest: Option[PullRequest], requestedReviewer: Option[RequestedReviewer])
  case class SearchResultItemConnection(codeCount: Option[Int], edges: List[Option[SearchResultItemEdge]], issueCount: Option[Int], nodes: List[Option[SearchResultItem]], pageInfo: Option[PageInfo], repositoryCount: Option[Int], userCount: Option[Int], wikiCount: Option[Int])
  case class SearchResultItemEdge(cursor: Option[String], node: Option[SearchResultItem], textMatches: List[Option[TextMatch]])
  sealed trait SearchType
  object SearchType {
    case object ISSUE extends SearchType
    case object REPOSITORY extends SearchType
    case object USER extends SearchType
  }
  sealed trait SecurityAdvisoryEcosystem
  object SecurityAdvisoryEcosystem {
    case object MAVEN extends SecurityAdvisoryEcosystem
    case object NPM extends SecurityAdvisoryEcosystem
    case object PIP extends SecurityAdvisoryEcosystem
    case object RUBYGEMS extends SecurityAdvisoryEcosystem
  }
  case class SecurityAdvisoryOrder()
  sealed trait SecurityAdvisoryOrderField
  object SecurityAdvisoryOrderField {
    case object CREATED_AT extends SecurityAdvisoryOrderField
    case object UPDATED_AT extends SecurityAdvisoryOrderField
  }
  sealed trait SecurityAdvisorySeverity
  object SecurityAdvisorySeverity {
    case object CRITICAL extends SecurityAdvisorySeverity
    case object HIGH extends SecurityAdvisorySeverity
    case object LOW extends SecurityAdvisorySeverity
    case object MODERATE extends SecurityAdvisorySeverity
  }
  case class SecurityAdvisoryVulnerabilityOrder()
  sealed trait SecurityAdvisoryVulnerabilityOrderField
  object SecurityAdvisoryVulnerabilityOrderField {
    case object CREATED_AT extends SecurityAdvisoryVulnerabilityOrderField
    case object UPDATED_AT extends SecurityAdvisoryVulnerabilityOrderField
  }
  case class SmimeSignature(email: Option[String], isValid: Option[Boolean], payload: Option[String], signature: Option[String], signer: Option[User], state: Option[GitSignatureState], wasSignedByGitHub: Option[Boolean])
  case class StarOrder()
  sealed trait StarOrderField
  object StarOrderField { case object STARRED_AT extends StarOrderField }
  case class StargazerConnection(edges: List[Option[StargazerEdge]], nodes: List[Option[User]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class StargazerEdge(cursor: Option[String], node: Option[User], starredAt: Option[DateTime])
  case class Starrable(id: Option[ID], stargazers: Option[StargazerConnection], viewerHasStarred: Option[Boolean])
  case class StarredRepositoryConnection(edges: List[Option[StarredRepositoryEdge]], nodes: List[Option[Repository]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class StarredRepositoryEdge(cursor: Option[String], node: Option[Repository], starredAt: Option[DateTime])
  case class Status(commit: Option[Commit], context: Option[StatusContext], contexts: List[Option[StatusContext]], id: Option[ID], state: Option[StatusState])
  case class StatusContext(commit: Option[Commit], context: Option[String], createdAt: Option[DateTime], creator: Option[Actor], description: Option[String], id: Option[ID], state: Option[StatusState], targetUrl: Option[URI])
  sealed trait StatusState
  object StatusState {
    case object ERROR extends StatusState
    case object EXPECTED extends StatusState
    case object FAILURE extends StatusState
    case object PENDING extends StatusState
    case object SUCCESS extends StatusState
  }
  case class SubmitPullRequestReviewInput()
  case class SubmitPullRequestReviewPayload(clientMutationId: Option[String], pullRequestReview: Option[PullRequestReview])
  case class Subscribable(id: Option[ID], viewerCanSubscribe: Option[Boolean], viewerSubscription: Option[SubscriptionState])
  case class SubscribedEvent(actor: Option[Actor], createdAt: Option[DateTime], id: Option[ID], subscribable: Option[Subscribable])
  sealed trait SubscriptionState
  object SubscriptionState {
    case object IGNORED extends SubscriptionState
    case object SUBSCRIBED extends SubscriptionState
    case object UNSUBSCRIBED extends SubscriptionState
  }
  case class SuggestedReviewer(isAuthor: Option[Boolean], isCommenter: Option[Boolean], reviewer: Option[User])
  case class Tag(abbreviatedOid: Option[String], commitResourcePath: Option[URI], commitUrl: Option[URI], id: Option[ID], message: Option[String], name: Option[String], oid: Option[GitObjectID], repository: Option[Repository], tagger: Option[GitActor], target: Option[GitObject])
  case class Team(ancestors: Option[TeamConnection], avatarUrl: Option[URI], childTeams: Option[TeamConnection], combinedSlug: Option[String], createdAt: Option[DateTime], description: Option[String], editTeamResourcePath: Option[URI], editTeamUrl: Option[URI], id: Option[ID], invitations: Option[OrganizationInvitationConnection], members: Option[TeamMemberConnection], membersResourcePath: Option[URI], membersUrl: Option[URI], name: Option[String], newTeamResourcePath: Option[URI], newTeamUrl: Option[URI], organization: Option[Organization], parentTeam: Option[Team], privacy: Option[TeamPrivacy], repositories: Option[TeamRepositoryConnection], repositoriesResourcePath: Option[URI], repositoriesUrl: Option[URI], resourcePath: Option[URI], slug: Option[String], teamsResourcePath: Option[URI], teamsUrl: Option[URI], updatedAt: Option[DateTime], url: Option[URI], viewerCanAdminister: Option[Boolean], viewerCanSubscribe: Option[Boolean], viewerSubscription: Option[SubscriptionState])
  case class TeamConnection(edges: List[Option[TeamEdge]], nodes: List[Option[Team]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class TeamEdge(cursor: Option[String], node: Option[Team])
  case class TeamMemberConnection(edges: List[Option[TeamMemberEdge]], nodes: List[Option[User]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class TeamMemberEdge(cursor: Option[String], memberAccessResourcePath: Option[URI], memberAccessUrl: Option[URI], node: Option[User], role: Option[TeamMemberRole])
  case class TeamMemberOrder()
  sealed trait TeamMemberOrderField
  object TeamMemberOrderField {
    case object CREATED_AT extends TeamMemberOrderField
    case object LOGIN extends TeamMemberOrderField
  }
  sealed trait TeamMemberRole
  object TeamMemberRole {
    case object MAINTAINER extends TeamMemberRole
    case object MEMBER extends TeamMemberRole
  }
  sealed trait TeamMembershipType
  object TeamMembershipType {
    case object ALL extends TeamMembershipType
    case object CHILD_TEAM extends TeamMembershipType
    case object IMMEDIATE extends TeamMembershipType
  }
  case class TeamOrder()
  sealed trait TeamOrderField
  object TeamOrderField { case object NAME extends TeamOrderField }
  sealed trait TeamPrivacy
  object TeamPrivacy {
    case object SECRET extends TeamPrivacy
    case object VISIBLE extends TeamPrivacy
  }
  case class TeamRepositoryConnection(edges: List[Option[TeamRepositoryEdge]], nodes: List[Option[Repository]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class TeamRepositoryEdge(cursor: Option[String], node: Option[Repository], permission: Option[RepositoryPermission])
  case class TeamRepositoryOrder()
  sealed trait TeamRepositoryOrderField
  object TeamRepositoryOrderField {
    case object CREATED_AT extends TeamRepositoryOrderField
    case object NAME extends TeamRepositoryOrderField
    case object PERMISSION extends TeamRepositoryOrderField
    case object PUSHED_AT extends TeamRepositoryOrderField
    case object STARGAZERS extends TeamRepositoryOrderField
    case object UPDATED_AT extends TeamRepositoryOrderField
  }
  sealed trait TeamRole
  object TeamRole {
    case object ADMIN extends TeamRole
    case object MEMBER extends TeamRole
  }
  case class TextMatch(fragment: Option[String], highlights: List[Option[TextMatchHighlight]], property: Option[String])
  case class TextMatchHighlight(beginIndice: Option[Int], endIndice: Option[Int], text: Option[String])
  case class Topic(id: Option[ID], name: Option[String], relatedTopics: List[Option[Topic]])
  case class TopicConnection(edges: List[Option[TopicEdge]], nodes: List[Option[Topic]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class TopicEdge(cursor: Option[String], node: Option[Topic])
  sealed trait TopicSuggestionDeclineReason
  object TopicSuggestionDeclineReason {
    case object NOT_RELEVANT extends TopicSuggestionDeclineReason
    case object PERSONAL_PREFERENCE extends TopicSuggestionDeclineReason
    case object TOO_GENERAL extends TopicSuggestionDeclineReason
    case object TOO_SPECIFIC extends TopicSuggestionDeclineReason
  }
  case class Tree(abbreviatedOid: Option[String], commitResourcePath: Option[URI], commitUrl: Option[URI], entries: List[Option[TreeEntry]], id: Option[ID], oid: Option[GitObjectID], repository: Option[Repository])
  case class TreeEntry(mode: Option[Int], name: Option[String], `object`: Option[GitObject], oid: Option[GitObjectID], repository: Option[Repository], `type`: Option[String])
  case class UnassignedEvent(actor: Option[Actor], assignable: Option[Assignable], createdAt: Option[DateTime], id: Option[ID], user: Option[User])
  case class UniformResourceLocatable(resourcePath: Option[URI], url: Option[URI])
  case class UnknownSignature(email: Option[String], isValid: Option[Boolean], payload: Option[String], signature: Option[String], signer: Option[User], state: Option[GitSignatureState], wasSignedByGitHub: Option[Boolean])
  case class UnlabeledEvent(actor: Option[Actor], createdAt: Option[DateTime], id: Option[ID], label: Option[Label], labelable: Option[Labelable])
  case class UnlockLockableInput()
  case class UnlockLockablePayload(clientMutationId: Option[String], unlockedRecord: Option[Lockable])
  case class UnlockedEvent(actor: Option[Actor], createdAt: Option[DateTime], id: Option[ID], lockable: Option[Lockable])
  case class UnsubscribedEvent(actor: Option[Actor], createdAt: Option[DateTime], id: Option[ID], subscribable: Option[Subscribable])
  case class Updatable(viewerCanUpdate: Option[Boolean])
  case class UpdatableComment(viewerCannotUpdateReasons: List[Option[CommentCannotUpdateReason]])
  case class UpdateProjectCardInput()
  case class UpdateProjectCardPayload(clientMutationId: Option[String], projectCard: Option[ProjectCard])
  case class UpdateProjectColumnInput()
  case class UpdateProjectColumnPayload(clientMutationId: Option[String], projectColumn: Option[ProjectColumn])
  case class UpdateProjectInput()
  case class UpdateProjectPayload(clientMutationId: Option[String], project: Option[Project])
  case class UpdatePullRequestReviewCommentInput()
  case class UpdatePullRequestReviewCommentPayload(clientMutationId: Option[String], pullRequestReviewComment: Option[PullRequestReviewComment])
  case class UpdatePullRequestReviewInput()
  case class UpdatePullRequestReviewPayload(clientMutationId: Option[String], pullRequestReview: Option[PullRequestReview])
  case class UpdateSubscriptionInput()
  case class UpdateSubscriptionPayload(clientMutationId: Option[String], subscribable: Option[Subscribable])
  case class UpdateTopicsInput()
  case class UpdateTopicsPayload(clientMutationId: Option[String], invalidTopicNames: List[Option[String]], repository: Option[Repository])
  case class User(avatarUrl: Option[URI], bio: Option[String], bioHTML: Option[HTML], commitComments: Option[CommitCommentConnection], company: Option[String], companyHTML: Option[HTML], createdAt: Option[DateTime], databaseId: Option[Int], email: Option[String], followers: Option[FollowerConnection], following: Option[FollowingConnection], gist: Option[Gist], gistComments: Option[GistCommentConnection], gists: Option[GistConnection], id: Option[ID], isBountyHunter: Option[Boolean], isCampusExpert: Option[Boolean], isDeveloperProgramMember: Option[Boolean], isEmployee: Option[Boolean], isHireable: Option[Boolean], isSiteAdmin: Option[Boolean], isViewer: Option[Boolean], issueComments: Option[IssueCommentConnection], issues: Option[IssueConnection], location: Option[String], login: Option[String], name: Option[String], organization: Option[Organization], organizations: Option[OrganizationConnection], pinnedRepositories: Option[RepositoryConnection], publicKeys: Option[PublicKeyConnection], pullRequests: Option[PullRequestConnection], repositories: Option[RepositoryConnection], repositoriesContributedTo: Option[RepositoryConnection], repository: Option[Repository], resourcePath: Option[URI], starredRepositories: Option[StarredRepositoryConnection], updatedAt: Option[DateTime], url: Option[URI], viewerCanFollow: Option[Boolean], viewerIsFollowing: Option[Boolean], watching: Option[RepositoryConnection], websiteUrl: Option[URI])
  case class UserConnection(edges: List[Option[UserEdge]], nodes: List[Option[User]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class UserContentEdit(createdAt: Option[DateTime], deletedAt: Option[DateTime], deletedBy: Option[Actor], diff: Option[String], editedAt: Option[DateTime], editor: Option[Actor], id: Option[ID], updatedAt: Option[DateTime])
  case class UserContentEditConnection(edges: List[Option[UserContentEditEdge]], nodes: List[Option[UserContentEdit]], pageInfo: Option[PageInfo], totalCount: Option[Int])
  case class UserContentEditEdge(cursor: Option[String], node: Option[UserContentEdit])
  case class UserEdge(cursor: Option[String], node: Option[User])
}