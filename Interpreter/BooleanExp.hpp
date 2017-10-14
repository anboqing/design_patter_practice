#ifndef _BOOLEANEXP_H_
#define _BOOLEANEXP_H_
#include <cstring>
class BooleanExp { 
public :
    BooleanExp ();
    virtual ~BooleanExp();

    virtual bool Evaluate (context &) = 0;
    virtual BooleanExp* Replace (const char *,BooleanExp &) = 0;
    virtual BooleanExp* Copy() const = 0;
};

class Context {
    public:
        bool Lookup(const char *) const;
        void Assign (VarialbleExp* ,bool);
};

class VariableExp : public BooleanExp {
    public:
        VariableExp(const char*);
        virtual ~VariableExp();

        virtual bool Evaluate(Context &);
        virtual BooleanExp* Replace(const char*,BooleanExp &);
        virtual BooleanExp* Copy() const;
    private:
        char* _name;
};

VariableExp::VariableExp(const char* name) {
    _name = strdup(name);
}

VariableExp::~VariableExp(){
    free(_name);
}

// Evaluating a variable returns its value in the current context;
bool VariableExp::Evaluate (Context & aContext) {
    return aContext.Lookup(_name);
}
// Copying a variable returns a new VariableExp;
BooleanExp* VariableExp::Copy() const {
    return new VariableExp(_name);
}

// To Replace a variable with an expression, we check to see if the variable has the same name as the one it is passed as an argument;
BooleanExp* VariableExp::Replace(const char* name,BooleanExp& exp) {
    //
    if(strcmp(name,_name)==0){
        return exp.Copy();
    }else{
        return new VariableExp(_name);
    }
}



#endif
