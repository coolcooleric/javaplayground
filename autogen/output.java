

public class output{
		
  public void genGui4DbStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4SpcStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4SpcNetworkElementStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4NacStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4PcmmCmtsAdaptorStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DqosCmtsAdaptorStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4NetworkElementStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4PcmmNetworkElementStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DqosNetworkElementStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4GateStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4PolicyServerStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4ConnectedNetworkElementStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4SubscriberUpdateStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4TopologyUpdateStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4MgpiAdaptorStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4RadiusAdaptorStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4RadiusNetworkElementStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4RadiusAcctStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4RadiusAcctNetworkElementStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DiameterAfAdaptorStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DiameterAfPeerStats(HashMap statValues, ArrayList statNames){
    
    addSingleStatForDisplay("CONNECT_TIME", statValues, statNames, MiConstants.StatCounterConversionType.DATETIME);

    addSingleStatForDisplay("DISCONNECT_TIME", statValues, statNames, MiConstants.StatCounterConversionType.DATETIME);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"ConnectionAddr","CONNECT_PORT"}, statValues, statNames, MiConstants.DISPLAY_STATS_ADDR_PORT_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"MSGIN_COUNT","MSGOUT_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"IN_ERROR_COUNT","OUT_ERROR_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"AAR_RECV_COUNT","AAR_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"AARI_RECV_COUNT","AARI_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"AARM_RECV_COUNT","AARM_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"AAA_RECV_SUCCESS_COUNT","AAA_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"AAA_RECV_FAILURE_COUNT","AAA_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"ASR_RECV_COUNT","ASR_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"ASA_RECV_SUCCESS_COUNT","ASA_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"ASA_RECV_FAILURE_COUNT","ASA_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"RAR_RECV_COUNT","RAR_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"RAA_RECV_SUCCESS_COUNT","RAA_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"RAA_RECV_FAILURE_COUNT","RAA_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"STR_RECV_COUNT","STR_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"STA_RECV_SUCCESS_COUNT","STA_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"STA_RECV_FAILURE_COUNT","STA_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
  }

  public void genGui4DiameterPcefAdaptorStats(HashMap statValues, ArrayList statNames){
    
    addSingleStatForDisplay("CONNECT_COUNT", statValues, statNames, MiConstants.StatCounterConversionType.CONNECTIONS);

    statsName.add("");
    
    addSingleStatForDisplay("PEER_OKAY_COUNT", statValues, statNames, MiConstants.StatCounterConversionType.NGOD_OPERSTATE);

    addMultipleStatsForDisplay(new String[] {"PEER_DOWN_COUNT","PEER_SUSPECT_COUNT","PEER_REOPEN_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"MSGIN_COUNT","MSGOUT_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"CCR_RECV_COUNT","CCR_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_RECV_SUCCESS_COUNT","CCA_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_RECV_FAILURE_COUNT","CCA_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"CCR_I_RECV_COUNT","CCR_I_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_I_RECV_SUCCESS_COUNT","CCA_I_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_I_RECV_FAILURE_COUNT","CCA_I_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"CCR_U_RECV_COUNT","CCR_U_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_U_RECV_SUCCESS_COUNT","CCA_U_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_U_RECV_FAILURE_COUNT","CCA_U_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"CCR_T_RECV_COUNT","CCR_T_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_T_RECV_SUCCESS_COUNT","CCA_T_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_T_RECV_FAILURE_COUNT","CCA_T_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"RAR_RECV_COUNT","RAR_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"RAA_RECV_SUCCESS_COUNT","RAA_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"RAA_RECV_FAILURE_COUNT","RAA_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
  }

  public void genGui4DiameterPcefPeerStats(HashMap statValues, ArrayList statNames){
    
    addSingleStatForDisplay("CONNECT_TIME", statValues, statNames, MiConstants.StatCounterConversionType.DATETIME);

    addSingleStatForDisplay("DISCONNECT_TIME", statValues, statNames, MiConstants.StatCounterConversionType.DATETIME);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"ConnectionAddr","CONNECT_PORT"}, statValues, statNames, MiConstants.DISPLAY_STATS_ADDR_PORT_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"MSGIN_COUNT","MSGOUT_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"IN_ERROR_COUNT","OUT_ERROR_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"MSGIN_COUNT","MSGOUT_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"CCR_RECV_COUNT","CCR_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_RECV_SUCCESS_COUNT","CCA_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_RECV_FAILURE_COUNT","CCA_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"CCR_I_RECV_COUNT","CCR_I_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_I_RECV_SUCCESS_COUNT","CCA_I_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_I_RECV_FAILURE_COUNT","CCA_I_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"CCR_U_RECV_COUNT","CCR_U_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_U_RECV_SUCCESS_COUNT","CCA_U_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_U_RECV_FAILURE_COUNT","CCA_U_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"CCR_T_RECV_COUNT","CCR_T_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_T_RECV_SUCCESS_COUNT","CCA_T_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_T_RECV_FAILURE_COUNT","CCA_T_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"RAR_RECV_COUNT","RAR_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"RAA_RECV_SUCCESS_COUNT","RAA_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"RAA_RECV_FAILURE_COUNT","RAA_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
  }

  public void genGui4DiameterBberfAdaptorStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DiameterBberfPeerStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DiameterGxplusAdaptorStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DiameterGxplusPeerStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DiameterMraAfAdaptorStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DiameterMraAfPeerStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DiameterMraPcefAdaptorStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DiameterMraPcefPeerStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DiameterMraCtfAdaptorStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DiameterMraCtfPeerStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DiameterMraBberfAdaptorStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DiameterMraBberfPeerStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DiameterMraDrmaAdaptorStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DiameterMraDrmaPeerStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DiameterMraDraStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4KpiMraStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4IntervalMraStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DiameterShAdaptorStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DiameterShPeerStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DiameterCTFAdaptorStats(HashMap statValues, ArrayList statNames){
    
    addSingleStatForDisplay("CONNECT_COUNT", statValues, statNames, MiConstants.StatCounterConversionType.CONNECTIONS);

    statsName.add("");
    
    addSingleStatForDisplay("PEER_OKAY_COUNT", statValues, statNames, MiConstants.StatCounterConversionType.NGOD_OPERSTATE);

    addMultipleStatsForDisplay(new String[] {"PEER_DOWN_COUNT","PEER_SUSPECT_COUNT","PEER_REOPEN_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"MSGIN_COUNT","MSGOUT_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"CCR_RECV_COUNT","CCR_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_RECV_SUCCESS_COUNT","CCA_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_RECV_FAILURE_COUNT","CCA_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"CCR_I_RECV_COUNT","CCR_I_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_I_RECV_SUCCESS_COUNT","CCA_I_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_I_RECV_FAILURE_COUNT","CCA_I_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"CCR_U_RECV_COUNT","CCR_U_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_U_RECV_SUCCESS_COUNT","CCA_U_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_U_RECV_FAILURE_COUNT","CCA_U_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"CCR_T_RECV_COUNT","CCR_T_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_T_RECV_SUCCESS_COUNT","CCA_T_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"CCA_T_RECV_FAILURE_COUNT","CCA_T_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"RAR_RECV_COUNT","RAR_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"RAA_RECV_SUCCESS_COUNT","RAA_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"RAA_RECV_FAILURE_COUNT","RAA_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addMultipleStatsForDisplay(new String[] {"ASR_RECV_COUNT","ASR_SEND_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"ASA_RECV_SUCCESS_COUNT","ASA_SEND_SUCCESS_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    addMultipleStatsForDisplay(new String[] {"ASA_RECV_FAILURE_COUNT","ASA_SEND_FAILURE_COUNT"}, statValues, statNames, MiConstants.DISPLAY_STATS_SEPARATOR);

    statsName.add("");
    
    addSingleStatForDisplay("ACTIVE_SESSION_COUNT", statValues, statNames, MiConstants.StatCounterConversionType.NONE);

    addSingleStatForDisplay("MAX_ACTIVE_SESSION_COUNT", statValues, statNames, MiConstants.StatCounterConversionType.NONE);

    statsName.add("");
    
  }

  public void genGui4DiameterCTFPeerStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4KpiStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4IntervalStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4LdapDataSourceStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4ShDataSourceStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4DhcpDataSourceStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4SprDataSourceStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4ConnectionErrorStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4ConnectionMraErrorStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4ProtocolErrorStats(HashMap statValues, ArrayList statNames){
    
  }

  public void genGui4ProtocolMraErrorStats(HashMap statValues, ArrayList statNames){
    
  }

}
	
	