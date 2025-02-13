package flowctrl.integration.slack.webapi;

public interface SlackWebApiConstants {

	public static final String SLACK_WEB_API_URL = "https://slack.com/api";
	public static final String SLACK_WEB_API_DOCUMENT_URL = "https://api.slack.com/methods";

	public static final int DEFAULT_TIMEOUT = 5000;

	public static final int DEFAULT_COUNT = 100;
	public static final int DEFAULT_PAGE = 1;

	// test

	public static final String API_TEST = "api.test";
	public static final String AUTH_TEST = "auth.test";

	// channels

	public static final String CHANNELS_ARCHIVE = "channels.archive";
	public static final String CHANNELS_CREATE = "channels.create";
	public static final String CHANNELS_HISTORY = "channels.history";
	public static final String CHANNELS_INFO = "channels.info";
	public static final String CHANNELS_INVITE = "channels.invite";
	public static final String CHANNELS_JOIN = "channels.join";
	public static final String CHANNELS_KICK = "channels.kick";
	public static final String CHANNELS_LEAVE = "channels.leave";
	public static final String CHANNELS_LIST = "channels.list";
	public static final String CHANNELS_MARK = "channels.mark";
	public static final String CHANNELS_RENAME = "channels.rename";
	public static final String CHANNELS_SET_PURPOSE = "channels.setPurpose";
	public static final String CHANNELS_SET_TOPIC = "channels.setTopic";
	public static final String CHANNELS_UNARCHIVE = "channels.unarchive";

	// chat

	public static final String CHAT_DELETE = "chat.delete";
	public static final String CHAT_POST_MESSAGE = "chat.postMessage";
	public static final String CHAT_UPDATE = "chat.update";

	// emoji

	public static final String EMOJI_LIST = "emoji.list";

	// files

	public static final String FILES_DELETE = "files.delete";
	public static final String FILES_INFO = "files.info";
	public static final String FILES_LIST = "files.list";
	public static final String FILES_UPLOAD = "files.upload";

	// group

	public static final String GROUPS_ARCHIVE = "groups.archive";
	public static final String GROUPS_CLOSE = "groups.close";
	public static final String GROUPS_CREATE = "groups.create";
	public static final String GROUPS_CREATE_CHILD = "groups.createChild";
	public static final String GROUPS_HISTORY = "groups.history";
	public static final String GROUPS_INFO = "groups.info";
	public static final String GROUPS_INVITE = "groups.invite";
	public static final String GROUPS_KICK = "groups.kick";
	public static final String GROUPS_LEAVE = "groups.leave";
	public static final String GROUPS_LIST = "groups.list";
	public static final String GROUPS_MARK = "groups.mark";
	public static final String GROUPS_OPEN = "groups.open";
	public static final String GROUPS_RENAME = "groups.rename";
	public static final String GROUPS_SET_PURPOSE = "groups.setPurpose";
	public static final String GROUPS_SET_TOPIC = "groups.setTopic";
	public static final String GROUPS_UNARCHIVE = "groups.unarchive";

	// im (direct message channel)

	public static final String IM_CLOSE = "im.close";
	public static final String IM_HISTORY = "im.history";
	public static final String IM_LIST = "im.list";
	public static final String IM_MARK = "im.mark";
	public static final String IM_OPEN = "im.open";

	// mipm

	public static final String MPIM_CLOSE = "mpim.close";
	public static final String MPIM_HISTORY = "mpim.history";
	public static final String MPIM_LIST = "mpim.list";
	public static final String MPIM_MARK = "mpim.mark";
	public static final String MPIM_OPEN = "mpim.open";

	// oauth

	// pins

	public static final String PINS_ADD = "pins.add";
	public static final String PINS_LIST = "pins.list";
	public static final String PINS_REMOVE = "pins.remove";

	// reactions

	public static final String REACTIONS_ADD = "reactions.add";
	public static final String REACTIONS_GET = "reactions.get";
	public static final String REACTIONS_LIST = "reactions.list";
	public static final String REACTIONS_REMOVE = "reactions.remove";

	// rtm

	public static final String RTM_START = "rtm.start";

	// search

	// stars

	public static final String STARS_ADD = "stars.add";
	public static final String STARS_LIST = "stars.list";
	public static final String STARS_REMOVE = "stars.remove";

	// team

	public static final String TEAM_ACCESS_LOGS = "team.accessLogs";
	public static final String TEAM_INFO = "team.info";
	public static final String TEAM_INTEGRATION_LOGS = "team.integrationLogs";

	// users

	public static final String USERS_GET_PRESENCE = "users.getPresence";
	public static final String USERS_INFO = "users.info";
	public static final String USERS_LIST = "users.list";
	public static final String USERS_SET_ACTIVE = "users.setActive";
	public static final String USERS_SET_PRESENCE = "users.setPresence";

}
