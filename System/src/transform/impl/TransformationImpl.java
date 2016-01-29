/**
 */
package transform.impl;

import grammar.Grammar;

import graph.Graph;

import graph.impl.NamedImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import transform.TransformPackage;
import transform.Transformation;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transformation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link transform.impl.TransformationImpl#getHote <em>Hote</em>}</li>
 *   <li>{@link transform.impl.TransformationImpl#getGrammar <em>Grammar</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransformationImpl extends NamedImpl implements Transformation {
	/**
	 * The cached value of the '{@link #getHote() <em>Hote</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHote()
	 * @generated
	 * @ordered
	 */
	protected Graph hote;

	/**
	 * The cached value of the '{@link #getGrammar() <em>Grammar</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrammar()
	 * @generated
	 * @ordered
	 */
	protected Grammar grammar;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransformationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TransformPackage.Literals.TRANSFORMATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph getHote() {
		if (hote != null && hote.eIsProxy()) {
			InternalEObject oldHote = (InternalEObject)hote;
			hote = (Graph)eResolveProxy(oldHote);
			if (hote != oldHote) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransformPackage.TRANSFORMATION__HOTE, oldHote, hote));
			}
		}
		return hote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Graph basicGetHote() {
		return hote;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHote(Graph newHote) {
		Graph oldHote = hote;
		hote = newHote;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformPackage.TRANSFORMATION__HOTE, oldHote, hote));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grammar getGrammar() {
		if (grammar != null && grammar.eIsProxy()) {
			InternalEObject oldGrammar = (InternalEObject)grammar;
			grammar = (Grammar)eResolveProxy(oldGrammar);
			if (grammar != oldGrammar) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, TransformPackage.TRANSFORMATION__GRAMMAR, oldGrammar, grammar));
			}
		}
		return grammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grammar basicGetGrammar() {
		return grammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGrammar(Grammar newGrammar) {
		Grammar oldGrammar = grammar;
		grammar = newGrammar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TransformPackage.TRANSFORMATION__GRAMMAR, oldGrammar, grammar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TransformPackage.TRANSFORMATION__HOTE:
				if (resolve) return getHote();
				return basicGetHote();
			case TransformPackage.TRANSFORMATION__GRAMMAR:
				if (resolve) return getGrammar();
				return basicGetGrammar();
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
			case TransformPackage.TRANSFORMATION__HOTE:
				setHote((Graph)newValue);
				return;
			case TransformPackage.TRANSFORMATION__GRAMMAR:
				setGrammar((Grammar)newValue);
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
			case TransformPackage.TRANSFORMATION__HOTE:
				setHote((Graph)null);
				return;
			case TransformPackage.TRANSFORMATION__GRAMMAR:
				setGrammar((Grammar)null);
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
			case TransformPackage.TRANSFORMATION__HOTE:
				return hote != null;
			case TransformPackage.TRANSFORMATION__GRAMMAR:
				return grammar != null;
		}
		return super.eIsSet(featureID);
	}

} //TransformationImpl
