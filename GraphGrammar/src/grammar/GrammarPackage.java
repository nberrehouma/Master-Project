/**
 */
package grammar;

import graph.GraphPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see grammar.GrammarFactory
 * @model kind="package"
 * @generated
 */
public interface GrammarPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "grammar";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://grammar/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "grammar";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	GrammarPackage eINSTANCE = grammar.impl.GrammarPackageImpl.init();

	/**
	 * The meta object id for the '{@link grammar.impl.GrammarImpl <em>Grammar</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grammar.impl.GrammarImpl
	 * @see grammar.impl.GrammarPackageImpl#getGrammar()
	 * @generated
	 */
	int GRAMMAR = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__NAME = GraphPackage.NAMED__NAME;

	/**
	 * The feature id for the '<em><b>Rules</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR__RULES = GraphPackage.NAMED_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_FEATURE_COUNT = GraphPackage.NAMED_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Grammar</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GRAMMAR_OPERATION_COUNT = GraphPackage.NAMED_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link grammar.impl.RuleImpl <em>Rule</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grammar.impl.RuleImpl
	 * @see grammar.impl.GrammarPackageImpl#getRule()
	 * @generated
	 */
	int RULE = 1;

	/**
	 * The feature id for the '<em><b>Parent Grammar</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PARENT_GRAMMAR = 0;

	/**
	 * The feature id for the '<em><b>Lhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__LHS = 1;

	/**
	 * The feature id for the '<em><b>Rhs</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__RHS = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__NAME = 3;

	/**
	 * The feature id for the '<em><b>Priority</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__PRIORITY = 4;

	/**
	 * The feature id for the '<em><b>Embedding Mechanism</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE__EMBEDDING_MECHANISM = 5;

	/**
	 * The number of structural features of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_FEATURE_COUNT = 6;

	/**
	 * The number of operations of the '<em>Rule</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RULE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link grammar.impl.LHSImpl <em>LHS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grammar.impl.LHSImpl
	 * @see grammar.impl.GrammarPackageImpl#getLHS()
	 * @generated
	 */
	int LHS = 2;

	/**
	 * The feature id for the '<em><b>Parent Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LHS__PARENT_RULE = 0;

	/**
	 * The feature id for the '<em><b>Node</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LHS__NODE = 1;

	/**
	 * The number of structural features of the '<em>LHS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LHS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>LHS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LHS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link grammar.impl.RHSImpl <em>RHS</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grammar.impl.RHSImpl
	 * @see grammar.impl.GrammarPackageImpl#getRHS()
	 * @generated
	 */
	int RHS = 3;

	/**
	 * The feature id for the '<em><b>Parent Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHS__PARENT_RULE = 0;

	/**
	 * The feature id for the '<em><b>Sub Graph</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHS__SUB_GRAPH = 1;

	/**
	 * The number of structural features of the '<em>RHS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHS_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>RHS</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RHS_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link grammar.impl.EmbeddingImpl <em>Embedding</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grammar.impl.EmbeddingImpl
	 * @see grammar.impl.GrammarPackageImpl#getEmbedding()
	 * @generated
	 */
	int EMBEDDING = 4;

	/**
	 * The feature id for the '<em><b>Parent Rule</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING__PARENT_RULE = 0;

	/**
	 * The feature id for the '<em><b>Instructions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING__INSTRUCTIONS = 1;

	/**
	 * The number of structural features of the '<em>Embedding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Embedding</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int EMBEDDING_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link grammar.impl.ConnexionInstructionImpl <em>Connexion Instruction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see grammar.impl.ConnexionInstructionImpl
	 * @see grammar.impl.GrammarPackageImpl#getConnexionInstruction()
	 * @generated
	 */
	int CONNEXION_INSTRUCTION = 5;

	/**
	 * The feature id for the '<em><b>Parent Embedding</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION_INSTRUCTION__PARENT_EMBEDDING = 0;

	/**
	 * The feature id for the '<em><b>M</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION_INSTRUCTION__M = 1;

	/**
	 * The feature id for the '<em><b>D</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION_INSTRUCTION__D = 2;

	/**
	 * The number of structural features of the '<em>Connexion Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION_INSTRUCTION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Connexion Instruction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNEXION_INSTRUCTION_OPERATION_COUNT = 0;


	/**
	 * Returns the meta object for class '{@link grammar.Grammar <em>Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Grammar</em>'.
	 * @see grammar.Grammar
	 * @generated
	 */
	EClass getGrammar();

	/**
	 * Returns the meta object for the containment reference list '{@link grammar.Grammar#getRules <em>Rules</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Rules</em>'.
	 * @see grammar.Grammar#getRules()
	 * @see #getGrammar()
	 * @generated
	 */
	EReference getGrammar_Rules();

	/**
	 * Returns the meta object for class '{@link grammar.Rule <em>Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Rule</em>'.
	 * @see grammar.Rule
	 * @generated
	 */
	EClass getRule();

	/**
	 * Returns the meta object for the container reference '{@link grammar.Rule#getParentGrammar <em>Parent Grammar</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Grammar</em>'.
	 * @see grammar.Rule#getParentGrammar()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_ParentGrammar();

	/**
	 * Returns the meta object for the containment reference '{@link grammar.Rule#getLhs <em>Lhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Lhs</em>'.
	 * @see grammar.Rule#getLhs()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Lhs();

	/**
	 * Returns the meta object for the containment reference '{@link grammar.Rule#getRhs <em>Rhs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Rhs</em>'.
	 * @see grammar.Rule#getRhs()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_Rhs();

	/**
	 * Returns the meta object for the attribute '{@link grammar.Rule#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see grammar.Rule#getName()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Name();

	/**
	 * Returns the meta object for the attribute '{@link grammar.Rule#getPriority <em>Priority</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Priority</em>'.
	 * @see grammar.Rule#getPriority()
	 * @see #getRule()
	 * @generated
	 */
	EAttribute getRule_Priority();

	/**
	 * Returns the meta object for the containment reference '{@link grammar.Rule#getEmbeddingMechanism <em>Embedding Mechanism</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Embedding Mechanism</em>'.
	 * @see grammar.Rule#getEmbeddingMechanism()
	 * @see #getRule()
	 * @generated
	 */
	EReference getRule_EmbeddingMechanism();

	/**
	 * Returns the meta object for class '{@link grammar.LHS <em>LHS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>LHS</em>'.
	 * @see grammar.LHS
	 * @generated
	 */
	EClass getLHS();

	/**
	 * Returns the meta object for the container reference '{@link grammar.LHS#getParentRule <em>Parent Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Rule</em>'.
	 * @see grammar.LHS#getParentRule()
	 * @see #getLHS()
	 * @generated
	 */
	EReference getLHS_ParentRule();

	/**
	 * Returns the meta object for the reference '{@link grammar.LHS#getNode <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Node</em>'.
	 * @see grammar.LHS#getNode()
	 * @see #getLHS()
	 * @generated
	 */
	EReference getLHS_Node();

	/**
	 * Returns the meta object for class '{@link grammar.RHS <em>RHS</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>RHS</em>'.
	 * @see grammar.RHS
	 * @generated
	 */
	EClass getRHS();

	/**
	 * Returns the meta object for the container reference '{@link grammar.RHS#getParentRule <em>Parent Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Rule</em>'.
	 * @see grammar.RHS#getParentRule()
	 * @see #getRHS()
	 * @generated
	 */
	EReference getRHS_ParentRule();

	/**
	 * Returns the meta object for the reference '{@link grammar.RHS#getSubGraph <em>Sub Graph</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Sub Graph</em>'.
	 * @see grammar.RHS#getSubGraph()
	 * @see #getRHS()
	 * @generated
	 */
	EReference getRHS_SubGraph();

	/**
	 * Returns the meta object for class '{@link grammar.Embedding <em>Embedding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Embedding</em>'.
	 * @see grammar.Embedding
	 * @generated
	 */
	EClass getEmbedding();

	/**
	 * Returns the meta object for the container reference '{@link grammar.Embedding#getParentRule <em>Parent Rule</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Rule</em>'.
	 * @see grammar.Embedding#getParentRule()
	 * @see #getEmbedding()
	 * @generated
	 */
	EReference getEmbedding_ParentRule();

	/**
	 * Returns the meta object for the containment reference list '{@link grammar.Embedding#getInstructions <em>Instructions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Instructions</em>'.
	 * @see grammar.Embedding#getInstructions()
	 * @see #getEmbedding()
	 * @generated
	 */
	EReference getEmbedding_Instructions();

	/**
	 * Returns the meta object for class '{@link grammar.ConnexionInstruction <em>Connexion Instruction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connexion Instruction</em>'.
	 * @see grammar.ConnexionInstruction
	 * @generated
	 */
	EClass getConnexionInstruction();

	/**
	 * Returns the meta object for the container reference '{@link grammar.ConnexionInstruction#getParentEmbedding <em>Parent Embedding</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent Embedding</em>'.
	 * @see grammar.ConnexionInstruction#getParentEmbedding()
	 * @see #getConnexionInstruction()
	 * @generated
	 */
	EReference getConnexionInstruction_ParentEmbedding();

	/**
	 * Returns the meta object for the attribute '{@link grammar.ConnexionInstruction#getM <em>M</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>M</em>'.
	 * @see grammar.ConnexionInstruction#getM()
	 * @see #getConnexionInstruction()
	 * @generated
	 */
	EAttribute getConnexionInstruction_M();

	/**
	 * Returns the meta object for the reference '{@link grammar.ConnexionInstruction#getD <em>D</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>D</em>'.
	 * @see grammar.ConnexionInstruction#getD()
	 * @see #getConnexionInstruction()
	 * @generated
	 */
	EReference getConnexionInstruction_D();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	GrammarFactory getGrammarFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link grammar.impl.GrammarImpl <em>Grammar</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grammar.impl.GrammarImpl
		 * @see grammar.impl.GrammarPackageImpl#getGrammar()
		 * @generated
		 */
		EClass GRAMMAR = eINSTANCE.getGrammar();

		/**
		 * The meta object literal for the '<em><b>Rules</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GRAMMAR__RULES = eINSTANCE.getGrammar_Rules();

		/**
		 * The meta object literal for the '{@link grammar.impl.RuleImpl <em>Rule</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grammar.impl.RuleImpl
		 * @see grammar.impl.GrammarPackageImpl#getRule()
		 * @generated
		 */
		EClass RULE = eINSTANCE.getRule();

		/**
		 * The meta object literal for the '<em><b>Parent Grammar</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__PARENT_GRAMMAR = eINSTANCE.getRule_ParentGrammar();

		/**
		 * The meta object literal for the '<em><b>Lhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__LHS = eINSTANCE.getRule_Lhs();

		/**
		 * The meta object literal for the '<em><b>Rhs</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__RHS = eINSTANCE.getRule_Rhs();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__NAME = eINSTANCE.getRule_Name();

		/**
		 * The meta object literal for the '<em><b>Priority</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RULE__PRIORITY = eINSTANCE.getRule_Priority();

		/**
		 * The meta object literal for the '<em><b>Embedding Mechanism</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RULE__EMBEDDING_MECHANISM = eINSTANCE.getRule_EmbeddingMechanism();

		/**
		 * The meta object literal for the '{@link grammar.impl.LHSImpl <em>LHS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grammar.impl.LHSImpl
		 * @see grammar.impl.GrammarPackageImpl#getLHS()
		 * @generated
		 */
		EClass LHS = eINSTANCE.getLHS();

		/**
		 * The meta object literal for the '<em><b>Parent Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LHS__PARENT_RULE = eINSTANCE.getLHS_ParentRule();

		/**
		 * The meta object literal for the '<em><b>Node</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LHS__NODE = eINSTANCE.getLHS_Node();

		/**
		 * The meta object literal for the '{@link grammar.impl.RHSImpl <em>RHS</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grammar.impl.RHSImpl
		 * @see grammar.impl.GrammarPackageImpl#getRHS()
		 * @generated
		 */
		EClass RHS = eINSTANCE.getRHS();

		/**
		 * The meta object literal for the '<em><b>Parent Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RHS__PARENT_RULE = eINSTANCE.getRHS_ParentRule();

		/**
		 * The meta object literal for the '<em><b>Sub Graph</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RHS__SUB_GRAPH = eINSTANCE.getRHS_SubGraph();

		/**
		 * The meta object literal for the '{@link grammar.impl.EmbeddingImpl <em>Embedding</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grammar.impl.EmbeddingImpl
		 * @see grammar.impl.GrammarPackageImpl#getEmbedding()
		 * @generated
		 */
		EClass EMBEDDING = eINSTANCE.getEmbedding();

		/**
		 * The meta object literal for the '<em><b>Parent Rule</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDING__PARENT_RULE = eINSTANCE.getEmbedding_ParentRule();

		/**
		 * The meta object literal for the '<em><b>Instructions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference EMBEDDING__INSTRUCTIONS = eINSTANCE.getEmbedding_Instructions();

		/**
		 * The meta object literal for the '{@link grammar.impl.ConnexionInstructionImpl <em>Connexion Instruction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see grammar.impl.ConnexionInstructionImpl
		 * @see grammar.impl.GrammarPackageImpl#getConnexionInstruction()
		 * @generated
		 */
		EClass CONNEXION_INSTRUCTION = eINSTANCE.getConnexionInstruction();

		/**
		 * The meta object literal for the '<em><b>Parent Embedding</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNEXION_INSTRUCTION__PARENT_EMBEDDING = eINSTANCE.getConnexionInstruction_ParentEmbedding();

		/**
		 * The meta object literal for the '<em><b>M</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONNEXION_INSTRUCTION__M = eINSTANCE.getConnexionInstruction_M();

		/**
		 * The meta object literal for the '<em><b>D</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNEXION_INSTRUCTION__D = eINSTANCE.getConnexionInstruction_D();

	}

} //GrammarPackage
