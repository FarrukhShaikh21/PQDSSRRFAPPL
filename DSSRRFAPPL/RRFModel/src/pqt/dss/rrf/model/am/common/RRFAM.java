package pqt.dss.rrf.model.am.common;

import oracle.jbo.ApplicationModule;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Jun 17 11:55:32 PKT 2016
// ---------------------------------------------------------------------
public interface RRFAM extends ApplicationModule {
    void Apply();


    void Rollback();

    void callWorkflow(oracle.jbo.domain.Number p_document_id, String ApprovalType);

    void DssApprove();

    void DeleteCommit();

    void callRRFWorkflow(oracle.jbo.domain.Number p_document_id);
}
