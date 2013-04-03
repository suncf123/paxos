package tom.cocagne.paxos;

public interface HeartbeatMessenger extends PracticalMessenger {
	
	public void sendHeartbeat( ProposalID leaderProposalID);
	
	public void schedule(int millisecondDelay, HeartbeatCallback callback);
	
	public void onLeadershipLost();
	
	public void onLeadershipChange(String previousLeaderUID, String newLeaderUID);
}
