#include<bits/stdc++.h>

using namespace std;

struct node
{
    int data;
    node* left;
    node* right;
};

node* createnew(int val)
{
    node* temp = new node;
    temp->data=val;
    temp->left=NULL;
    temp->right=NULL;
    return temp;
}

bool isBSTUtil(node* ele,int mini,int maxi)
{
    if(ele==NULL)
        return 1;

    if(ele->data<mini || ele->data>maxi)
    return 0;

    return (isBSTUtil(ele->left,mini,ele->data) && isBSTUtil(ele->right,ele->data,maxi));
}

bool isBST(node* root)
{
    return isBSTUtil(root,INT_MIN,INT_MAX);
}

int main()
{
    node* root=createnew(5);
    root->left=createnew(3);
    root->right=createnew(20);
    root->left->right=createnew(4);
    bool ans=isBST(root);
    cout<<ans;


   return 0;
}
