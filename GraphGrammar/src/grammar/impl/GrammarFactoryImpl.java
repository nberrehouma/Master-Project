/**
 */
package grammar.impl;

import grammar.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class GrammarFactoryImpl extends EFactoryImpl implements GrammarFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GrammarFactory init() {
		try {
			GrammarFactory theGrammarFactory = (GrammarFactory)EPackage.Registry.INSTANCE.getEFactory(GrammarPackage.eNS_URI);
			if (theGrammarFactory != null) {
				return theGrammarFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new GrammarFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case GrammarPackage.GRAMMAR: return createGrammar();
			case GrammarPackage.RULE: return createRule();
			case GrammarPackage.LHS: return createLHS();
			case GrammarPackage.RHS: return createRHS();
			case GrammarPackage.EMBEDDING: return createEmbedding();
			case GrammarPackage.CONNEXION_INSTRUCTION: return createConnexionInstruction();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Grammar createGrammar() {
		GrammarImpl grammar = new GrammarImpl();
		return grammar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Rule createRule() {
		RuleImpl rule = new RuleImpl();
		return rule;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LHS createLHS() {
		LHSImpl lhs = new LHSImpl();
		return lhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RHS createRHS() {
		RHSImpl rhs = new RHSImpl();
		return rhs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Embedding createEmbedding() {
		EmbeddingImpl embedding = new EmbeddingImpl();
		return embedding;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConnexionInstruction createConnexionInstruction() {
		ConnexionInstructionImpl connexionInstruction = new ConnexionInstructionImpl();
		return connexionInstruction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GrammarPackage getGrammarPackage() {
		return (GrammarPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static GrammarPackage getPackage() {
		return GrammarPackage.eINSTANCE;
	}

} //GrammarFactoryImpl
