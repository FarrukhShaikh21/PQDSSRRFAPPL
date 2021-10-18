package pqt.dss.rrf.view;

import javax.faces.application.FacesMessage;

import javax.faces.context.FacesContext;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelGroupLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelHeader;
import oracle.adf.view.rich.component.rich.layout.RichPanelLabelAndMessage;
import oracle.adf.view.rich.component.rich.layout.RichPanelStretchLayout;
import oracle.adf.view.rich.component.rich.layout.RichToolbar;
import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.output.RichOutputText;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;
import oracle.adf.view.rich.component.rich.output.RichSeparator;

import oracle.binding.AttributeBinding;
import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import org.apache.myfaces.trinidad.component.UIXGroup;
import org.apache.myfaces.trinidad.component.UIXSwitcher;

public class rrfCreateUpdate {
    private RichTable t3;
    private RichButton b4;
    private RichToolbar t5;
    private RichPanelCollection pc2;
    private RichPanelHeader ph3;
    private RichSeparator s1;
    private RichTable t2;
    private RichButton b3;
    private RichToolbar t4;
    private RichPanelCollection pc1;
    private RichPanelHeader ph2;
    private RichSeparator s2;
    private RichInputText it26;
    private RichInputText it25;
    private RichInputListOfValues newBranchId;
    private RichInputDate id6;
    private RichInputListOfValues ilov2;
    private RichInputDate id8;
    private RichInputDate id7;
    private RichInputText it24;
    private RichInputText it1;
    private RichInputText it23;
    private RichInputText it22;
    private RichInputListOfValues ilov1;
    private RichOutputText ot1;
    private RichPanelLabelAndMessage plam1;
    private RichPanelFormLayout pfl2;
    private RichPanelGroupLayout pgl1;
    private RichButton b2;
    private RichButton b1;
    private UIXGroup g1;
    private RichToolbar t1;
    private RichPanelHeader ph1;
    private RichPanelStretchLayout psl1;
    private RichInputListOfValues currentBranchId;
    private RichPanelFormLayout pfl1;
    private RichInputText it2;
    private RichInputText it3;
    private RichInputText it4;
    private RichInputText it5;
    private RichInputText it21;
    private RichInputText it27;
    private RichInputDate id1;
    private UIXSwitcher s3;
    private RichInputListOfValues mgrCodeId;
    private RichInputText it28;
    private RichInputText it29;
    private RichInputText it30;

    public rrfCreateUpdate() {
    }

    public void setT3(RichTable t3) {
        this.t3 = t3;
    }

    public RichTable getT3() {
        return t3;
    }

    public void setB4(RichButton b4) {
        this.b4 = b4;
    }

    public RichButton getB4() {
        return b4;
    }

    public void setT5(RichToolbar t5) {
        this.t5 = t5;
    }

    public RichToolbar getT5() {
        return t5;
    }

    public void setPc2(RichPanelCollection pc2) {
        this.pc2 = pc2;
    }

    public RichPanelCollection getPc2() {
        return pc2;
    }

    public void setPh3(RichPanelHeader ph3) {
        this.ph3 = ph3;
    }

    public RichPanelHeader getPh3() {
        return ph3;
    }

    public void setS1(RichSeparator s1) {
        this.s1 = s1;
    }

    public RichSeparator getS1() {
        return s1;
    }

    public void setT2(RichTable t2) {
        this.t2 = t2;
    }

    public RichTable getT2() {
        return t2;
    }

    public void setB3(RichButton b3) {
        this.b3 = b3;
    }

    public RichButton getB3() {
        return b3;
    }

    public void setT4(RichToolbar t4) {
        this.t4 = t4;
    }

    public RichToolbar getT4() {
        return t4;
    }

    public void setPc1(RichPanelCollection pc1) {
        this.pc1 = pc1;
    }

    public RichPanelCollection getPc1() {
        return pc1;
    }

    public void setPh2(RichPanelHeader ph2) {
        this.ph2 = ph2;
    }

    public RichPanelHeader getPh2() {
        return ph2;
    }

    public void setS2(RichSeparator s2) {
        this.s2 = s2;
    }

    public RichSeparator getS2() {
        return s2;
    }

    public void setIt26(RichInputText it26) {
        this.it26 = it26;
    }

    public RichInputText getIt26() {
        return it26;
    }

    public void setIt25(RichInputText it25) {
        this.it25 = it25;
    }

    public RichInputText getIt25() {
        return it25;
    }


    public void setNewBranchId(RichInputListOfValues newBranchId) {
        this.newBranchId = newBranchId;
    }

    public RichInputListOfValues getNewBranchId() {
        return newBranchId;
    }

    public void setId6(RichInputDate id6) {
        this.id6 = id6;
    }

    public RichInputDate getId6() {
        return id6;
    }

    public void setIlov2(RichInputListOfValues ilov2) {
        this.ilov2 = ilov2;
    }

    public RichInputListOfValues getIlov2() {
        return ilov2;
    }


    public void setId8(RichInputDate id8) {
        this.id8 = id8;
    }

    public RichInputDate getId8() {
        return id8;
    }

    public void setId7(RichInputDate id7) {
        this.id7 = id7;
    }

    public RichInputDate getId7() {
        return id7;
    }

    public void setIt24(RichInputText it24) {
        this.it24 = it24;
    }

    public RichInputText getIt24() {
        return it24;
    }

    public void setIt1(RichInputText it1) {
        this.it1 = it1;
    }

    public RichInputText getIt1() {
        return it1;
    }

    public void setIt23(RichInputText it23) {
        this.it23 = it23;
    }

    public RichInputText getIt23() {
        return it23;
    }

    public void setIt22(RichInputText it22) {
        this.it22 = it22;
    }

    public RichInputText getIt22() {
        return it22;
    }


    public void setIlov1(RichInputListOfValues ilov1) {
        this.ilov1 = ilov1;
    }

    public RichInputListOfValues getIlov1() {
        return ilov1;
    }

    public void setOt1(RichOutputText ot1) {
        this.ot1 = ot1;
    }

    public RichOutputText getOt1() {
        return ot1;
    }

    public void setPlam1(RichPanelLabelAndMessage plam1) {
        this.plam1 = plam1;
    }

    public RichPanelLabelAndMessage getPlam1() {
        return plam1;
    }

    public void setPfl2(RichPanelFormLayout pfl2) {
        this.pfl2 = pfl2;
    }

    public RichPanelFormLayout getPfl2() {
        return pfl2;
    }

    public void setPgl1(RichPanelGroupLayout pgl1) {
        this.pgl1 = pgl1;
    }

    public RichPanelGroupLayout getPgl1() {
        return pgl1;
    }

    public void setB2(RichButton b2) {
        this.b2 = b2;
    }

    public RichButton getB2() {
        return b2;
    }

    public void setB1(RichButton b1) {
        this.b1 = b1;
    }

    public RichButton getB1() {
        return b1;
    }

    public void setG1(UIXGroup g1) {
        this.g1 = g1;
    }

    public UIXGroup getG1() {
        return g1;
    }

    public void setT1(RichToolbar t1) {
        this.t1 = t1;
    }

    public RichToolbar getT1() {
        return t1;
    }

    public void setPh1(RichPanelHeader ph1) {
        this.ph1 = ph1;
    }

    public RichPanelHeader getPh1() {
        return ph1;
    }

    public void setPsl1(RichPanelStretchLayout psl1) {
        this.psl1 = psl1;
    }

    public RichPanelStretchLayout getPsl1() {
        return psl1;
    }

    public BindingContainer getBindings() {
        return BindingContext.getCurrent().getCurrentBindingsEntry();
    }
    public Object getAttributeValue(String AttrName) {
        BindingContainer bdCont = BindingContext.getCurrent().getCurrentBindingsEntry();
        AttributeBinding val = (AttributeBinding) bdCont.getControlBinding(AttrName);
        return val.getInputValue();
    }

    public String b2_action() {
        int i = Integer.parseInt(getAttributeValue("Nlevel").toString());
        BindingContainer bindings = getBindings();
        OperationBinding operationBinding = bindings.getOperationBinding("Apply");
        DCBindingContainer dcBinding = (DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding LineVO = (DCIteratorBinding)dcBinding.get("DssReinstatementExistMgrView1Iterator");
        DCIteratorBinding DtlVO = (DCIteratorBinding)dcBinding.get("DssReinstatementNewHiringView1Iterator");
        {
        if(i <50){
            if(LineVO.getEstimatedRowCount() == 0 || DtlVO.getEstimatedRowCount() == 0){
                FacesMessage msg = new FacesMessage(FacesMessage.SEVERITY_ERROR,  "Please add Manager Recruited and new Recruited Manager Details", "");
                FacesContext.getCurrentInstance().addMessage(null, msg);
            } else{
                    operationBinding.execute();
                }
        } else{
                     operationBinding.execute();     
                 }
       
    
        }
        return null;
    }


    public void setCurrentBranchId(RichInputListOfValues currentBranchId) {
        this.currentBranchId = currentBranchId;
    }

    public RichInputListOfValues getCurrentBranchId() {
        return currentBranchId;
    }

    public void setPfl1(RichPanelFormLayout pfl1) {
        this.pfl1 = pfl1;
    }

    public RichPanelFormLayout getPfl1() {
        return pfl1;
    }

    public void setIt2(RichInputText it2) {
        this.it2 = it2;
    }

    public RichInputText getIt2() {
        return it2;
    }

    public void setIt3(RichInputText it3) {
        this.it3 = it3;
    }

    public RichInputText getIt3() {
        return it3;
    }

    public void setIt4(RichInputText it4) {
        this.it4 = it4;
    }

    public RichInputText getIt4() {
        return it4;
    }

    public void setIt5(RichInputText it5) {
        this.it5 = it5;
    }

    public RichInputText getIt5() {
        return it5;
    }

    public void setIt21(RichInputText it21) {
        this.it21 = it21;
    }

    public RichInputText getIt21() {
        return it21;
    }

    public void setIt27(RichInputText it27) {
        this.it27 = it27;
    }

    public RichInputText getIt27() {
        return it27;
    }

    public void setId1(RichInputDate id1) {
        this.id1 = id1;
    }

    public RichInputDate getId1() {
        return id1;
    }


    public void setS3(UIXSwitcher s3) {
        this.s3 = s3;
    }

    public UIXSwitcher getS3() {
        return s3;
    }


    public void setMgrCodeId(RichInputListOfValues mgrCodeId) {
        this.mgrCodeId = mgrCodeId;
    }

    public RichInputListOfValues getMgrCodeId() {
        return mgrCodeId;
    }

    public void setIt28(RichInputText it28) {
        this.it28 = it28;
    }

    public RichInputText getIt28() {
        return it28;
    }

    public void setIt29(RichInputText it29) {
        this.it29 = it29;
    }

    public RichInputText getIt29() {
        return it29;
    }

    public void setIt30(RichInputText it30) {
        this.it30 = it30;
    }

    public RichInputText getIt30() {
        return it30;
    }
}
