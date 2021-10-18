package pqt.dss.rrf.model.vo;

import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import javax.servlet.http.HttpSession;

import oracle.jbo.ViewCriteria;
import oracle.jbo.ViewObject;
import oracle.jbo.domain.Number;
import oracle.jbo.server.ViewObjectImpl;

import pqt.dss.rrf.model.vo.common.DssReinstatementRequestFormView;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jul 13 11:10:18 PKT 2016
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class DssReinstatementRequestFormViewImpl extends ViewObjectImpl implements DssReinstatementRequestFormView {
    /**
     * This is the default constructor (do not remove).
     */
    public DssReinstatementRequestFormViewImpl() {
    }

    /**
     * Returns the variable value for VC_Manager_Agent_Name.
     * @return variable value for VC_Manager_Agent_Name
     */
    public String getVC_Manager_Agent_Name() {
        return (String) ensureVariableManager().getVariableValue("VC_Manager_Agent_Name");
    }

    /**
     * Sets <code>value</code> for variable VC_Manager_Agent_Name.
     * @param value value to bind as VC_Manager_Agent_Name
     */
    public void setVC_Manager_Agent_Name(String value) {
        ensureVariableManager().setVariableValue("VC_Manager_Agent_Name", value);
    }

    /**
     * Returns the variable value for VC_ACCOUNT_NO.
     * @return variable value for VC_ACCOUNT_NO
     */
    public String getVC_ACCOUNT_NO() {
        return (String) ensureVariableManager().getVariableValue("VC_ACCOUNT_NO");
    }

    /**
     * Sets <code>value</code> for variable VC_ACCOUNT_NO.
     * @param value value to bind as VC_ACCOUNT_NO
     */
    public void setVC_ACCOUNT_NO(String value) {
        ensureVariableManager().setVariableValue("VC_ACCOUNT_NO", value);
    }

    /**
     * Returns the variable value for NVC_WfDocumentId.
     * @return variable value for NVC_WfDocumentId
     */
    public Number getNVC_WfDocumentId() {
        return (Number) ensureVariableManager().getVariableValue("NVC_WfDocumentId");
    }

    /**
     * Sets <code>value</code> for variable NVC_WfDocumentId.
     * @param value value to bind as NVC_WfDocumentId
     */
    public void setNVC_WfDocumentId(Number value) {
        ensureVariableManager().setVariableValue("NVC_WfDocumentId", value);
    }
    public void exeViewCriteria(Number val){
        ViewObject vo = this.getViewObject();
        ViewCriteria vc = this.getViewCriteria("NotificationViewCriteria");
        vo.applyViewCriteria(vc);
        vo.setNamedWhereClauseParam("NVC_WfDocumentId", val);
        vo.executeQuery();
        }

    /**
     * Returns the variable value for VC_Doc_No.
     * @return variable value for VC_Doc_No
     */
    public String getVC_Doc_No() {
        return (String) ensureVariableManager().getVariableValue("VC_Doc_No");
    }

    /**
     * Sets <code>value</code> for variable VC_Doc_No.
     * @param value value to bind as VC_Doc_No
     */
    public void setVC_Doc_No(String value) {
        ensureVariableManager().setVariableValue("VC_Doc_No", value);
    }

    public void rrfSearchUser()
    {
              ViewCriteria vc = this.getViewCriteria("DssReinstatementRequestFormViewCriteria");
              this.applyViewCriteria(vc);

              setWhereClause(null);
              FacesContext fctx = FacesContext.getCurrentInstance();
              ExternalContext ectx = fctx.getExternalContext();
              HttpSession userSession = (HttpSession) ectx.getSession(false);
              Object VUserID = userSession.getAttribute("pUserId") == null ? "0" : userSession.getAttribute("pUserId");
              setWhereClause("exists\n" + 
              " (select 1 \n" + 
              "          from dss_sm_user_branch a\n" + 
              "         where a.user_id_fk = "+ VUserID+"\n" + 
              "           and a.branch_code = CURR_BRANCH_CODE_FK)");
    //              setWhereClause("USER_ID_FK =" + VUserID);
              executeQuery();
          }

}
