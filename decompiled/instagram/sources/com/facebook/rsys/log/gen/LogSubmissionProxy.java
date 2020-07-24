package com.facebook.rsys.log.gen;

public abstract class LogSubmissionProxy {
    public abstract void submitCallSummary(CallSummaryInfo callSummaryInfo);

    public abstract void submitConnectionStartEventLog(CallConnectionStartEventLog callConnectionStartEventLog);

    public abstract void submitConsoleLog(CallConsoleLog callConsoleLog);

    public abstract void submitE2eeLog(CallE2eeEventLog callE2eeEventLog);

    public abstract void submitGroupEscalationEventLog(CallGroupEscalationEventLog callGroupEscalationEventLog);

    public abstract void submitOverlayConfigDiagnosticEventLog(CallOverlayConfigDiagnosticEventLog callOverlayConfigDiagnosticEventLog);

    public abstract void submitPeerConnectionSummaryEventLog(CallPeerConnectionSummaryEventLog callPeerConnectionSummaryEventLog);

    public abstract void submitPeerRestartEventLog(CallPeerRestartEventLog callPeerRestartEventLog);

    public abstract void submitSignalingReliabilityEventLog(CallSignalingReliabilityEventLog callSignalingReliabilityEventLog);

    public abstract void submitTslogEventLog(CallTslogEventLog callTslogEventLog);
}
