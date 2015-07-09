/**
 */
package de.hub.visualemf.modiscodata.impl;

import de.hub.visualemf.modiscodata.ClassMetricsItem;
import de.hub.visualemf.modiscodata.ModiscoDataPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Class Metrics Item</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.hub.visualemf.modiscodata.impl.ClassMetricsItemImpl#getWmc <em>Wmc</em>}</li>
 *   <li>{@link de.hub.visualemf.modiscodata.impl.ClassMetricsItemImpl#getWmc_cc <em>Wmc cc</em>}</li>
 *   <li>{@link de.hub.visualemf.modiscodata.impl.ClassMetricsItemImpl#getDit <em>Dit</em>}</li>
 *   <li>{@link de.hub.visualemf.modiscodata.impl.ClassMetricsItemImpl#getNoc <em>Noc</em>}</li>
 *   <li>{@link de.hub.visualemf.modiscodata.impl.ClassMetricsItemImpl#getCbo <em>Cbo</em>}</li>
 *   <li>{@link de.hub.visualemf.modiscodata.impl.ClassMetricsItemImpl#getRfc <em>Rfc</em>}</li>
 *   <li>{@link de.hub.visualemf.modiscodata.impl.ClassMetricsItemImpl#getLcom <em>Lcom</em>}</li>
 *   <li>{@link de.hub.visualemf.modiscodata.impl.ClassMetricsItemImpl#getSize <em>Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ClassMetricsItemImpl extends MoDiscoDataItemImpl implements ClassMetricsItem {
	/**
	 * The default value of the '{@link #getWmc() <em>Wmc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWmc()
	 * @generated
	 * @ordered
	 */
	protected static final int WMC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWmc() <em>Wmc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWmc()
	 * @generated
	 * @ordered
	 */
	protected int wmc = WMC_EDEFAULT;

	/**
	 * The default value of the '{@link #getWmc_cc() <em>Wmc cc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWmc_cc()
	 * @generated
	 * @ordered
	 */
	protected static final int WMC_CC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getWmc_cc() <em>Wmc cc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWmc_cc()
	 * @generated
	 * @ordered
	 */
	protected int wmc_cc = WMC_CC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDit() <em>Dit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDit()
	 * @generated
	 * @ordered
	 */
	protected static final int DIT_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getDit() <em>Dit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDit()
	 * @generated
	 * @ordered
	 */
	protected int dit = DIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getNoc() <em>Noc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoc()
	 * @generated
	 * @ordered
	 */
	protected static final int NOC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNoc() <em>Noc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNoc()
	 * @generated
	 * @ordered
	 */
	protected int noc = NOC_EDEFAULT;

	/**
	 * The default value of the '{@link #getCbo() <em>Cbo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCbo()
	 * @generated
	 * @ordered
	 */
	protected static final int CBO_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getCbo() <em>Cbo</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCbo()
	 * @generated
	 * @ordered
	 */
	protected int cbo = CBO_EDEFAULT;

	/**
	 * The default value of the '{@link #getRfc() <em>Rfc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfc()
	 * @generated
	 * @ordered
	 */
	protected static final int RFC_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getRfc() <em>Rfc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRfc()
	 * @generated
	 * @ordered
	 */
	protected int rfc = RFC_EDEFAULT;

	/**
	 * The default value of the '{@link #getLcom() <em>Lcom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLcom()
	 * @generated
	 * @ordered
	 */
	protected static final int LCOM_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getLcom() <em>Lcom</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLcom()
	 * @generated
	 * @ordered
	 */
	protected int lcom = LCOM_EDEFAULT;

	/**
	 * The default value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected static final int SIZE_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getSize() <em>Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSize()
	 * @generated
	 * @ordered
	 */
	protected int size = SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClassMetricsItemImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ModiscoDataPackage.Literals.CLASS_METRICS_ITEM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWmc() {
		return wmc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWmc(int newWmc) {
		int oldWmc = wmc;
		wmc = newWmc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoDataPackage.CLASS_METRICS_ITEM__WMC, oldWmc, wmc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getWmc_cc() {
		return wmc_cc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWmc_cc(int newWmc_cc) {
		int oldWmc_cc = wmc_cc;
		wmc_cc = newWmc_cc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoDataPackage.CLASS_METRICS_ITEM__WMC_CC, oldWmc_cc, wmc_cc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getDit() {
		return dit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDit(int newDit) {
		int oldDit = dit;
		dit = newDit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoDataPackage.CLASS_METRICS_ITEM__DIT, oldDit, dit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNoc() {
		return noc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNoc(int newNoc) {
		int oldNoc = noc;
		noc = newNoc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoDataPackage.CLASS_METRICS_ITEM__NOC, oldNoc, noc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getCbo() {
		return cbo;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCbo(int newCbo) {
		int oldCbo = cbo;
		cbo = newCbo;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoDataPackage.CLASS_METRICS_ITEM__CBO, oldCbo, cbo));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getRfc() {
		return rfc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRfc(int newRfc) {
		int oldRfc = rfc;
		rfc = newRfc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoDataPackage.CLASS_METRICS_ITEM__RFC, oldRfc, rfc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getLcom() {
		return lcom;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLcom(int newLcom) {
		int oldLcom = lcom;
		lcom = newLcom;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoDataPackage.CLASS_METRICS_ITEM__LCOM, oldLcom, lcom));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getSize() {
		return size;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSize(int newSize) {
		int oldSize = size;
		size = newSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ModiscoDataPackage.CLASS_METRICS_ITEM__SIZE, oldSize, size));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ModiscoDataPackage.CLASS_METRICS_ITEM__WMC:
				return getWmc();
			case ModiscoDataPackage.CLASS_METRICS_ITEM__WMC_CC:
				return getWmc_cc();
			case ModiscoDataPackage.CLASS_METRICS_ITEM__DIT:
				return getDit();
			case ModiscoDataPackage.CLASS_METRICS_ITEM__NOC:
				return getNoc();
			case ModiscoDataPackage.CLASS_METRICS_ITEM__CBO:
				return getCbo();
			case ModiscoDataPackage.CLASS_METRICS_ITEM__RFC:
				return getRfc();
			case ModiscoDataPackage.CLASS_METRICS_ITEM__LCOM:
				return getLcom();
			case ModiscoDataPackage.CLASS_METRICS_ITEM__SIZE:
				return getSize();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ModiscoDataPackage.CLASS_METRICS_ITEM__WMC:
				setWmc((Integer)newValue);
				return;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__WMC_CC:
				setWmc_cc((Integer)newValue);
				return;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__DIT:
				setDit((Integer)newValue);
				return;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__NOC:
				setNoc((Integer)newValue);
				return;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__CBO:
				setCbo((Integer)newValue);
				return;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__RFC:
				setRfc((Integer)newValue);
				return;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__LCOM:
				setLcom((Integer)newValue);
				return;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__SIZE:
				setSize((Integer)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ModiscoDataPackage.CLASS_METRICS_ITEM__WMC:
				setWmc(WMC_EDEFAULT);
				return;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__WMC_CC:
				setWmc_cc(WMC_CC_EDEFAULT);
				return;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__DIT:
				setDit(DIT_EDEFAULT);
				return;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__NOC:
				setNoc(NOC_EDEFAULT);
				return;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__CBO:
				setCbo(CBO_EDEFAULT);
				return;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__RFC:
				setRfc(RFC_EDEFAULT);
				return;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__LCOM:
				setLcom(LCOM_EDEFAULT);
				return;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__SIZE:
				setSize(SIZE_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ModiscoDataPackage.CLASS_METRICS_ITEM__WMC:
				return wmc != WMC_EDEFAULT;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__WMC_CC:
				return wmc_cc != WMC_CC_EDEFAULT;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__DIT:
				return dit != DIT_EDEFAULT;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__NOC:
				return noc != NOC_EDEFAULT;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__CBO:
				return cbo != CBO_EDEFAULT;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__RFC:
				return rfc != RFC_EDEFAULT;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__LCOM:
				return lcom != LCOM_EDEFAULT;
			case ModiscoDataPackage.CLASS_METRICS_ITEM__SIZE:
				return size != SIZE_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (wmc: ");
		result.append(wmc);
		result.append(", wmc_cc: ");
		result.append(wmc_cc);
		result.append(", dit: ");
		result.append(dit);
		result.append(", noc: ");
		result.append(noc);
		result.append(", cbo: ");
		result.append(cbo);
		result.append(", rfc: ");
		result.append(rfc);
		result.append(", lcom: ");
		result.append(lcom);
		result.append(", size: ");
		result.append(size);
		result.append(')');
		return result.toString();
	}

} //ClassMetricsItemImpl
