package tr.edu.izu.iprocess.matrix.operation;

import junit.framework.TestCase;
import tr.edu.izu.iprocess.matrix.impl.IntegerMatrix;

public class ScaleWithScalarTest extends TestCase {

	private IntegerMatrix matris = null;

	@Override
	protected void setUp() throws Exception {
		super.setUp();
		matris = new IntegerMatrix(3, 3);
	}

	public void testNothing() {
		assertEquals(matris.getColumnsCount(), 3);
	}

}
