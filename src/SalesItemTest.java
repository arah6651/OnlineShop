/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author marda237
 */
public class SalesItemTest {
    
    /**
     * Default constructor for test class SalesItemTest
     */
    public SalesItemTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    


    /**
     * Sets up the test fixture.
     *
     * Called before every test case method.
     */
    @Before
    public void setUp() {
        
        //TODO: Implement set-up bench of two salesItem-object, add a comment to the second salesItem.
        //TODO: Add automised test based on those objects in test-methods
    }
    /**
     * Tears down the test fixture.
     *
     * Called after every test case method.
     */
    @After
    public void tearDown() {
    }

    /**
     * Test that a comment can be added, and that the comment count is correct afterwards.
     */
    @Test
    public void testAddComment()
    {
        //TODO: Implement test for adding a comment to a SalesItem. Assert number of comments.

    }

    /**
     * Test that a comment using an illegal rating value is rejected.
     */
    @Test
    public void testIllegalRating()
    {
        //TODO: Implement test for illegal rating. Assert incoming values for rating in constructor is false.

    }

    /**
     * Test that a sales item is correctly initialised (name and price).
     */
    @Test
    public void testInit()
    {
        //TODO: Implement test for initialization of SalesItem. Assert value of instance variables when caling get()-methods.

    }

    @Test
    public void addComment()
    {
        //TODO: Implement test for adding a comment to a SalesItem. Assert incoming values for constructor is true

    }
}
