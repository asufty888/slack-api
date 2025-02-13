package flowctrl.integration.slack.webapi;

import java.io.InputStream;
import java.util.List;
import java.util.Map;

import flowctrl.integration.slack.type.Attachment;
import flowctrl.integration.slack.type.Authentication;
import flowctrl.integration.slack.type.Channel;
import flowctrl.integration.slack.type.DirectMessageChannel;
import flowctrl.integration.slack.type.File;
import flowctrl.integration.slack.type.FileInfo;
import flowctrl.integration.slack.type.FileList;
import flowctrl.integration.slack.type.Group;
import flowctrl.integration.slack.type.History;
import flowctrl.integration.slack.type.PinItem;
import flowctrl.integration.slack.type.Presence;
import flowctrl.integration.slack.type.ReactionItem;
import flowctrl.integration.slack.type.ReactionList;
import flowctrl.integration.slack.type.StarList;
import flowctrl.integration.slack.type.Team;
import flowctrl.integration.slack.type.TeamAccessLogList;
import flowctrl.integration.slack.type.TeamIntegrationLogList;
import flowctrl.integration.slack.type.User;
import flowctrl.integration.slack.type.UserPresence;
import flowctrl.integration.slack.webapi.method.chats.ChatPostMessageMethod;

public interface SlackWebApiClient {
	
	void shutdown();
	
	// auth

	Authentication auth();
	
	// channels

	boolean archiveChannel(String channel);
	Channel createChannel(String name);
	History getChannelHistory(String channel);
	History getChannelHistory(String channel, int count);
	History getChannelHistory(String channel, String latest, String oldest, boolean inclusive, int count, boolean unreads);
	Channel getChannelInfo(String channel);
	Channel inviteUserToChannel(String channel, String user);
	Channel joinChannel(String name);
	boolean kickUserFormChannel(String channel, String user);
	boolean leaveChannel(String channel);
	List<Channel> getChannelList();
	List<Channel> getChannelList(boolean exclude_archived);
	boolean markChannel(String channel, String ts);
	Channel renameChannel(String channel, String name);
	boolean setChannelPurpose(String channel, String purpose);
	boolean setChannelTopic(String channel, String topic);
	boolean unarchiveChannel(String channel);
	
	// chat

	boolean deleteMessage(String channel, String ts);
	String postMessage(String channel, String text);
	String postMessage(String channel, String text, String username, boolean as_user);
	String postMessage(String channel, String text, String username, boolean as_user, boolean link_names, List<Attachment> attachments, boolean unfurl_links, boolean unfurl_media, String icon_url,
			String icon_emoji);
	String postMessage(ChatPostMessageMethod method);
	String updateMessage(String channel, String ts, String text);
	String updateMessage(String channel, String ts, String text, List<Attachment> attachments, boolean link_names);

	// emoji
	
	Map<String, String> getEmojiList();
	
	// files

	boolean deleteFile(String file);
	FileInfo getFileInfo(String file);
	FileInfo getFileInfo(String file, int page);
	FileInfo getFileInfo(String file, int page, int count);
	FileList getFileList();
	FileList getFileList(int page);
	FileList getFileList(int page, int count);
	FileList getFileList(String user);
	FileList getFileList(String user, int page);
	FileList getFileList(String user, int page, int count);
	FileList getFileList(String user, String ts_from, String ts_to, String types, int page, int count);
	File uploadFile(java.io.File file, String title, String initial_comment, String channels);
	File uploadFile(java.io.File file, String filetype, String filename, String title, String initial_comment, String channels);
	File uploadFile(InputStream is, String filetype, String filename, String title, String initial_comment, String channels);

	// groups
	
	boolean archiveGroup(String channel);
	boolean closeGroup(String channel);
	Group createGroup(String name);
	Group createChildGroup(String name);
	History getGroupHistory(String channel);
	History getGroupHistory(String channel, int count);
	History getGroupHistory(String channel, String latest, String oldest, boolean inclusive, int count, boolean unreads);
	Group getGroupInfo(String channel);
	Group inviteUserToGroup(String channel, String user);
	boolean kickUserFormGroup(String channel, String user);
	boolean leaveGroup(String channel);
	List<Group> getGroupList();
	List<Group> getGroupList(boolean exclude_archived);
	boolean markGroup(String channel, String ts);
	boolean openGroup(String channel);
	Group renameGroup(String channel, String name);
	boolean setGroupPurpose(String channel, String purpose);
	boolean setGroupTopic(String channel, String topic);
	boolean unarchiveGroup(String channel);
	
	// im (direct message channel)

	boolean closeDirectMessageChannel(String channel);
	History getDirectMessageChannelHistory(String channel);
	History getDirectMessageChannelHistory(String channel, int count);
	History getDirectMessageChannelHistory(String channel, String latest, String oldest, boolean inclusive, int count, boolean unreads);
	List<DirectMessageChannel> getDirectMessageChannelList();
	boolean markDirectMessageChannel(String channel, String ts);
	boolean openDirectMessageChannel(String user);
	
	// mpim (multiparty direct message channel)
	
	boolean closeMultipartyDirectMessageChannel(String channel);
	History getMultipartyDirectMessageChannelHistory(String channel);
	History getMultipartyDirectMessageChannelHistory(String channel, int count);
	History getMultipartyDirectMessageChannelHistory(String channel, String latest, String oldest, boolean inclusive, int count, boolean unreads);
	List<Group> getMultipartyDirectMessageChannelList();
	boolean markMultipartyDirectMessageChannel(String channel, String ts);
	Group openMultipartyDirectMessageChannel(String... users);
	Group openMultipartyDirectMessageChannel(List<String> users);

	// pins
	
	boolean pinFile(String channel, String file);
	boolean pinFileComment(String channel, String file_comment);
	boolean pinMessage(String channel, String timestamp);
	List<PinItem> getPinList(String channel);
	boolean unpinFile(String channel, String file);
	boolean unpinFileComment(String channel, String file_comment);
	boolean unpinMessage(String channel, String timestamp);

	// reactions
	
	boolean addReactionToFile(String emojiName, String file);
	boolean addReactionToFileComment(String emojiName, String file_comment);
	boolean addReactionToMessage(String emojiName, String channel, String timestamp);
	ReactionItem getReactionByFile(String emojiName, String file);
	ReactionItem getReactionByFileComment(String emojiName, String file_comment);
	ReactionItem getReactionByMessage(String emojiName, String channel, String timestamp);
	ReactionList getReactionList(int page);
	ReactionList getReactionList(int page, int count);
	ReactionList getReactionList(String user, int page);
	ReactionList getReactionList(String user, int page, int count);
	boolean removeReactionToFile(String emojiName, String file);
	boolean removeReactionToFileComment(String emojiName, String file_comment);
	boolean removeReactionToMessage(String emojiName, String channel, String timestamp);
	
	// rtm
	
	String startRealTimeMessagingApi();
	String startRealTimeMessagingApi(String simple_latest, String no_unreads, String mpim_aware);

	// stars
	
	boolean addStarToFile(String file);
	boolean addStarToFileComment(String file_comment);
	boolean addStarToMessage(String channel, String timestamp);
	StarList getStarList(int page);
	StarList getStarList(int page, int count);
	StarList getStarList(String user, int page);
	StarList getStarList(String user, int page, int count);
	boolean removeStarToFile(String file);
	boolean removeStarToFileComment(String file_comment);
	boolean removeStarToMessage(String channel, String timestamp);

	// team
	
	TeamAccessLogList getTeamAccessLogList(int page);
	TeamAccessLogList getTeamAccessLogList(int page, int count);
	Team getTeamInfo();
	TeamIntegrationLogList getTeamIntegrationLogList(int page);
	TeamIntegrationLogList getTeamIntegrationLogList(int page, int count);
	TeamIntegrationLogList getTeamIntegrationLogList(String service_id, String app_id, String user, String change_type, int page, int count);
	
	// users

	UserPresence getUserPresence(String user);
	User getUserInfo(String user);
	List<User> getUserList();
	List<User> getUserListWithPresence();
	boolean setActiveUser();
	boolean setPresenceUser(Presence presence);

}
