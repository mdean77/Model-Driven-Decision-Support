/**
 */
package glucose.tests;

import glucose.GlucoseDecision;
import glucose.GlucoseFactory;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class GlucoseDecisionTest extends ClinicalDecisionTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(GlucoseDecisionTest.class);
	}

	/**
	 * Constructs a new Decision test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GlucoseDecisionTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Decision test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected GlucoseDecision getFixture() {
		return (GlucoseDecision)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(GlucoseFactory.eINSTANCE.createGlucoseDecision());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //GlucoseDecisionTest
