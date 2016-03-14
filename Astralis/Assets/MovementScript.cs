using UnityEngine;
using System.Collections;

public class MovementScript : MonoBehaviour {

    private Vector3 spritePos;
    private Vector3 touchPos;
    private Vector3 movementPos;
    private float movementx;
    private float movementy;
    // Use this for initialization
    void Start () {

        movementx = 0;
        movementy = 0;
	}
	
	// Update is called once per frame
	void Update ()
    {
        MoveUpdate();
	}
    
    void MoveUpdate()
    {
        if (Application.platform == RuntimePlatform.Android)
        {
            //pos = Camera.main.ScreenToWorldPoint(new Vector3(Input.GetTouch(0).position.x, Input.GetTouch(0).position.y, 1));
            spritePos = transform.position;
            touchPos = Camera.main.ScreenToWorldPoint(new Vector3(Input.GetTouch(0).position.x, Input.GetTouch(0).position.y, 1));

            /*if(spritePos.x > touchPos.x)
            {
                movementx = spritePos.x - touchPos.x;
            }
            else if(spritePos.x < touchPos.x)
            {
                movementx = touchPos.x - spritePos.x;
            }

            if(spritePos.y > touchPos.y)
            {
                movementy = spritePos.y - touchPos.y;
            }
            else if(spritePos.y < touchPos.y)
            {
                movementy = touchPos.y - spritePos.y;
            }*/
            movementx = spritePos.x - touchPos.x;
            movementy = spritePos.y - touchPos.y;
            

            
        }
        //to move properly, get the difference of the position of the sprite versus the position of the touch, then apply
        //that to the sprite so it moves
        /*else
        {
            spritePos = transform.position;
            
            touchPos = Camera.main.ScreenToWorldPoint(new Vector3(Input.mousePosition.x, Input.mousePosition.y, 1));
            movementx = spritePos.x - touchPos.x;
            movementy = spritePos.y - touchPos.y;
        }*/

        transform.position = new Vector3(touchPos.x + movementx, touchPos.y + movementy, 1);
        //transform.position = new Vector3(spritePos.x + movementx, spritePos.y + movementy, 1);
    }
}
